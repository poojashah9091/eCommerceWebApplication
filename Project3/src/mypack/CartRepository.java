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
public interface CartRepository extends JpaRepository<Cart,Integer>{

	Cart save(Cart c);
	List<Cart> findAll();
	void deleteById(int id);
	@Modifying
	@Query("update Cart c set c.custid = :custid, c.other_shipping_addr = :other_shipping_addr, c.order_Date=:order_Date, c.delivery_Date=:delivery_Date, c.delivery_Option=:delivery_Option, c.order_Dtl_id=:order_Dtl_id,c.totalDiscount=:totalDiscount,c.ePointsEarned=:ePointsEarned,c.totalBill=:totalBill where c.orderid = :orderid")
	void update(@Param("custid") int custid,@Param("other_shipping_addr") String other_shipping_addr,@Param("order_Date") String order_Date,@Param("delivery_Date") String delivery_Date,@Param("delivery_Option") String delivery_Option, @Param("order_Dtl_id") int order_Dtl_id,@Param("totalDiscount") int totalDiscount,@Param("ePointsEarned") int ePointsEarned,@Param("totalBill") int totalBill, @Param("orderid") int orderid);
	Cart findById(int id);

}

