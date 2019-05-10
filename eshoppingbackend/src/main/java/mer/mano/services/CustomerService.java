package mer.mano.services;

import mer.mano.model.Customer;
import mer.mano.model.User;

public interface CustomerService {
	void registerCustomer(Customer customer);
	boolean isEmailValid(String email);
	boolean isUsernameValid(String username);
	User getUser(String username);

}
