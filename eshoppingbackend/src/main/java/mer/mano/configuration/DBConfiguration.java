package mer.mano.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import mer.mano.model.Authorities;
import mer.mano.model.BillingAddress;
import mer.mano.model.Cart;
import mer.mano.model.CartItem;
import mer.mano.model.Category;
import mer.mano.model.Customer;
import mer.mano.model.CustomerOrder;
import mer.mano.model.Product;
import mer.mano.model.ShippingAddress;
import mer.mano.model.Supplier;
import mer.mano.model.User;

@Configuration
@EnableTransactionManagement
@ComponentScan("mer.mano.DBConfiguration")
public class DBConfiguration 
{

	@Bean(name="dataSource")
	public DataSource dataSource() {
	    BasicDataSource dataSource = new BasicDataSource();
	    dataSource.setDriverClassName("org.h2.Driver");
	    dataSource.setUrl("jdbc:h2:tcp://localhost/~/merwinproj");
	    dataSource.setUsername("sa");
	    dataSource.setPassword("sa");
	    return dataSource;
	}
	/*
	 * <bean id="sessionFactory" class="org.springframework.orm.hibernate4.LocalSessionFactoryBuilder">
	 * <property name="dataSource" ref="dataSource">
	 */

	@Bean
	public SessionFactory sessionFactory() 
	{
		LocalSessionFactoryBuilder lsf=
				new LocalSessionFactoryBuilder(dataSource());
		Properties hibernateProperties=new Properties();
		hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		lsf.addProperties(hibernateProperties);
		//An array of Class objects of all the entities
		//Map all entities to relational table
		Class classes[]=new Class[]{Product.class,Category.class,Supplier.class,User.class,Authorities.class,Customer.class,BillingAddress.class,ShippingAddress.class,Cart.class,CartItem.class,CustomerOrder.class};
	    return lsf.addAnnotatedClasses(classes).buildSessionFactory();
	}
	@Bean
	public HibernateTransactionManager hibTransManagement()
	{
		return new HibernateTransactionManager(sessionFactory());
	}
}
