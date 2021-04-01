package customerMaster;

import java.util.List;

public interface CustomerServices {

	public List<Customer_Master> getCustomers();
	public Customer_Master getCustomer(int custId);	
	public Customer_Master addCustomers(Customer_Master c);
	public void deleteCustomer(int custId);
	public Customer_Master updateCustomer(Customer_Master c, int custId);

}
