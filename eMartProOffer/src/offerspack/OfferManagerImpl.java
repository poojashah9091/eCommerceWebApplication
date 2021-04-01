package offerspack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferManagerImpl implements OfferManager {
	@Autowired
	OfferRepository repository;

	@Override
	public void addOffer(Offer o) {
		repository.save(o);
	}

	@Override
	public List<Offer> getOffers() {
		return repository.findAll();
	}

	@Override
	public void delete(int oid) {
		repository.deleteById(oid);
	}

	@Override
	public void update(Offer o, int oid) {
		repository.update(o.getMinTransaction(),o.getExpiryDate(),o.getPromoCode(),o.getOfferCondition(),o.getOfferID());

	}

	@Override
	public Offer getOffer(int oid) {
		return repository.findById(oid);
	}

}
