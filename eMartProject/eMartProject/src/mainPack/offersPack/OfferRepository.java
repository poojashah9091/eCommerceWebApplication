package mainPack.offersPack;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface OfferRepository extends JpaRepository<Offer, Integer> {
	Offer save(Offer o);

	List<Offer> findAll();

	void deleteById(int oid);

	@Modifying
	@Query("update Offer o set o.minTransaction=:minTransaction, o.expiryDate=:expiryDate, o.promoCode=:promoCode, o.offerCondition=:offerCondition where o.offerID = :offerID")
	void update(@Param("minTransaction") int minTransaction, @Param("expiryDate") String expiryDate,
			@Param("promoCode") String promoCode, @Param("offerCondition") String offerCondition,
			@Param("offerID") int offerID);

	Offer findById(int oid);
}
