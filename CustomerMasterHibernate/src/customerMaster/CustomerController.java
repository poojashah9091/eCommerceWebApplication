package customerMaster;


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
public class CustomerController {
	
	
	@Autowired
	private CustomerServices custServ;

	@GetMapping(value = "Allcustomers",headers = "Accept=application/json")
	public String getCustomers()
	{
		return new Gson().toJson(custServ.getCustomers());
	}
	
	
	@GetMapping(value = "GetCustomer/{custid}", headers = "Accept=application/json")
	public Customer_Master getCustomer(@PathVariable int custid) {
		
		Customer_Master c=custServ.getCustomer(custid);
		return c;
	}
	
	@PostMapping(value = "AddCustomer", headers = "Accept=application/json")
	public Customer_Master addCustomers(@RequestBody Customer_Master c) {
		 return this.custServ.addCustomers(c);
	}
	
	@DeleteMapping(value = "DeleteCustomer/{custid}", headers = "Accept=application/json") 
	public void deleteCustomer(@PathVariable int custid) {
		 custServ.deleteCustomer(custid);
	}
	
	
	@PutMapping(value = "UpdateCustomer/{custid}",headers = "Accept=application/json") 
	public Customer_Master updateCustomer(@RequestBody Customer_Master c, @PathVariable int custid) {
		return custServ.updateCustomer(c, custid);
	}

}
