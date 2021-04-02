package mainPack.cartPack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartServices {
	
	@Autowired
	CartRepository repository;

	@Override
	public List<Cart> getAll() {
		return repository.findAll();
	}

	@Override
	public Cart get(int orderid) {
		return repository.findById(orderid);
	}

	@Override
	public void add(Cart c) {
		 repository.save(c);
	}

	@Override
	public void delete(int orderid) {
		repository.deleteById(orderid);
		
	}

	@Override
	public void update(Cart c, int orderid) {
      repository.update(c.getCustid(),c.getOther_shipping_addr(),c.getOrder_Date(),c.getDelivery_Date(),c.getDelivery_Option(),c.getOrder_Dtl_id(),c.getTotalDiscount(),c.getePointsEarned(),c.getTotalBill(),orderid);
		
	}

}
