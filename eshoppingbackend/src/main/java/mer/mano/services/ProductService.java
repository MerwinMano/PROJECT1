package mer.mano.services;

import java.util.List;

import mer.mano.model.Category;
import mer.mano.model.Product;


public interface ProductService {

	List<Product> getAllProducts();
	Product getProduct(int id);
	void deleteProduct(int id);
	List<Category> getAllCategories();
	void saveOrUpdateProduct(Product product);
}
