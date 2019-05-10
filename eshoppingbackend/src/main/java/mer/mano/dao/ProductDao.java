package mer.mano.dao;

import java.util.List;

import mer.mano.model.Category;
import mer.mano.model.Product;


public interface ProductDao {
	

	List<Product> getAllProducts(); //select * from product
	Product getProduct(int id);
	void deleteProduct(int id); //delete from product where id=?
	List<Category> getCategories();
	void saveOrUpdateProduct(Product product);

	
	
}





