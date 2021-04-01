package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceManagerImpl implements InvoiceManager{

	@Autowired
	InvoiceRepository repository;
	
	@Override
	public List<Invoice> get() {
		return repository.findAll();
	}

	@Override
	public Invoice get(int id) {
		return repository.findById(id);
	}

	@Override
	public void add(Invoice i) {
		repository.save(i);
		
	}

	@Override
	public void update(Invoice i,int id) {
		repository.update(i.getCustID(),i.getOtherShippingAddr(),i.getOrderDate(),i.getDeliveryDate(),i.getDeliveryOption(),i.getOrderDtlID(),i.getTotalDiscount(),i.getePointsEarned(),i.getTotalBill(),id);
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
		
	}

}
