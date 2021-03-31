package categoryPack;

import java.util.List;

public interface CategoryManager
{
	void addCategory(Category c);
	List<Category> getCategories();
	void delete(int cid);
	void update(Category category,int cid);
	Category getCategory(int cid);
}
