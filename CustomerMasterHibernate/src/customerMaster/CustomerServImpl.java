package customerMaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServImpl implements CustomerServices {
	
	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer_Master> getCustomers() {
		// TODO Auto-generated method stub
		return 	repository.findAll();
	}

	@Override
	public Customer_Master getCustomer(int custid) {
		// TODO Auto-generated method stub
		return repository.findById(custid);
	}

	@Override
	public Customer_Master addCustomers(Customer_Master c) {
		// TODO Auto-generated method stub
		repository.save(c);
		return c;
	}

	@Override
	public void deleteCustomer(int custid) {
		// TODO Auto-generated method stub
		repository.deleteById(custid);
	}

	@Override
	public Customer_Master updateCustomer(Customer_Master c, int custid) {
		// TODO Auto-generated method stub
		repository.update(c.getInvoiceOrder_id(), c.getCust_Name(), c.getCust_Address(), c.getCust_PhoneNo(), c.getCust_UserID(), c.getCust_Password(), c.getCust_Email_ID(), c.geteMCardNo(), c.geteMartPoints(), custid);
		return c;
	}

}
