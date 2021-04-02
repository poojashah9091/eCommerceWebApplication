package mainPack.categoryPack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryManagerImpl implements CategoryManager
{
	@Autowired
	CategoryRepository repository;
	

	@Override
	public void addCategory(Category c) {
		repository.save(c);
	}

	@Override
	public List<Category> getCategories() {
		return repository.findAll();
	}

	@Override
	public void delete(int cid) {
		repository.deleteChildById(cid);
		repository.deleteById(cid);
	}

	@Override
	public void update(Category c,int cid) {
		repository.update(c.getCatCode(),c.getSubCatCode(),c.getCatName(),c.getImg_src(),c.isFlag(),c.getBrand(),cid);
		
	}

	@Override
	public Category getCategory(int cid) {
		return repository.findById(cid);
	}
}
