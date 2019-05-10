package mer.mano.dao;


import java.util.List;
import mer.mano.model.Category;

public interface CategoryDAO 
{

	public boolean addCategory(Category category);
	public boolean deleteCategory(Category category);
	public boolean updateCategory(Category category);
	public Category getCategory(int id);
	public List<Category> listCategories();
	
	
}
