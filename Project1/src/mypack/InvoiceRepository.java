package mypack;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
@Transactional
public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

	Invoice save(Invoice c);
	List<Invoice> findAll();
	void deleteById(int id);
	@Modifying
	@Query("update Invoice i set i.custID = :custID, i.otherShippingAddr = :otherShippingAddr, i.orderDate=:orderDate, i.deliveryDate=:deliveryDate, i.deliveryOption=:deliveryOption, i.orderDtlID=:orderDtlID,i.totalDiscount=:totalDiscount,i.ePointsEarned=:ePointsEarned,i.totalBill=:totalBill where i.invoiceOrderID = :invoiceOrderID")
	void update(@Param("custID") int custID,@Param("otherShippingAddr") String otherShippingAddr,@Param("orderDate") String orderDate,@Param("deliveryDate") String deliveryDate,@Param("deliveryOption") String deliveryOption, @Param("orderDtlID") int orderDtlID,@Param("totalDiscount") int totalDiscount,@Param("ePointsEarned") int ePointsEarned,@Param("totalBill") int totalBill, @Param("invoiceOrderID") int invoiceOrderID);
	Invoice findById(int id);
}
