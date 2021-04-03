package mainPack.categoryPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import mainPack.productPack.ProductManager;

@RestController  
@RequestMapping("/Category")
@CrossOrigin("http://localhost:3000")
public class CategoryController
{
	@Autowired
	CategoryManager manager;
	
	@Autowired
	ProductManager manager2;
	
	@GetMapping(value = "AllCategories",headers = "Accept=application/json")  
	 public String showCategories()
	 {
		  return new Gson().toJson(manager.getCategories());
	 }
	@GetMapping(value = "GetCategory/{cid}", headers = "Accept=application/json")  
	 public Category getCategory(@PathVariable int cid)
	 {
		Category c=manager.getCategory(cid);
		return c;
	 }
	@DeleteMapping(value = "DeleteCategory/{cid}", headers = "Accept=application/json")  
	 public void removeCategory(@PathVariable int cid)
	 {
		manager.delete(cid);
	 }
	@PutMapping(value = "UpdateCategory/{cid}",headers = "Accept=application/json")  
	 public void updateCategory(@RequestBody Category category,@PathVariable int cid)
	 {
		manager.update(category,cid);
	 }
	@PostMapping(value = "AddCategory", headers = "Accept=application/json")  
	 public void addCat(@RequestBody Category category)
	 {
		manager.addCategory(category);
	 }
}
