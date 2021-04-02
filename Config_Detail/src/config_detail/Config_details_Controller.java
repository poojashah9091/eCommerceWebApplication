package config_detail;


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
@CrossOrigin("http://localhost:3306")
public class Config_details_Controller {
	
	@Autowired
	Config_details_Manager cdm;
	
	@GetMapping(value="getAll_Config_details", headers = "Accept=application/json")
	public String getAll(){
		return new Gson().toJson(cdm.getAll_Config_details());
	}
	
	@GetMapping(value="get_Config_details_ById/{id}", headers = "Accept=application/json")
	public String getById(@PathVariable int id){
		return new Gson().toJson(cdm.get_config_details_ById(id));
	}
	
	/*@GetMapping(value="get_Config_details_By_ProductId/{id}", headers = "Accept=application/json")
	public String getByProductId(@PathVariable int id) {
		return new Gson().toJson(cdm.get_confif_details_By_ProductId(id));
	}*/
	
	@DeleteMapping(value="delete_Config_details_ById/{id}", headers = "Accept=application/json")
	public String delete(@PathVariable int id){
		return new Gson().toJson(cdm.delete_config_details(id));
	}
	
	@PostMapping(value="add_Config_details", headers = "Accept=application/json")
	public String add(@RequestBody Config_details cd){
		return new Gson().toJson(cdm.add_Config_detail(cd));
	}
	
	@PutMapping(value="update_Config_details_ById/{id}", headers = "Accept=application/json")
	public String update(@RequestBody Config_details cd, @PathVariable int id) {
		return new Gson().toJson(cdm.update_config_details(cd, id));
	}
}
