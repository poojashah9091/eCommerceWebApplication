package mypack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController  
@CrossOrigin("http://localhost:3000")
public class CartController {

	@Autowired
	CartServices cartServ;
	
	@GetMapping(value = "AllData",headers = "Accept=application/json")  
	 public String show()
	 {
		  return new Gson().toJson(cartServ.getAll());
	 }
	
	@GetMapping(value = "GetData/{id}", headers = "Accept=application/json")  
	 public Cart get(@PathVariable int id)
	 {
		Cart c=cartServ.get(id);
		return c;
	 }
	
	@DeleteMapping(value = "DeleteData/{id}", headers = "Accept=application/json")  
	 public void remove(@PathVariable int id)
	 {
		cartServ.delete(id);
	 }
	
	@PutMapping(value = "UpdateData/{id}",headers = "Accept=application/json")  
	 public void update(@RequestBody Cart i,@PathVariable int id)
	 {
		 cartServ.update(i,id);
	 }
	
	@PostMapping(value = "AddData", headers = "Accept=application/json")  
	 public void add(@RequestBody Cart i)
	 {
		cartServ.add(i);
	 }
}
