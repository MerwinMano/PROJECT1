package mer.mano.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mer.mano.dao.CustomerDao;
import mer.mano.model.Customer;
import mer.mano.model.User;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	public void registerCustomer(Customer customer) {
		customerDao.registerCustomer(customer);
		
	}
	public boolean isEmailValid(String email) {
		return customerDao.isEmailValid(email);
	}
	public boolean isUsernameValid(String username) {
		return customerDao.isUsernameValid(username);
	}
	public User getUser(String username) {
		return customerDao.getUser(username);
	}

}
