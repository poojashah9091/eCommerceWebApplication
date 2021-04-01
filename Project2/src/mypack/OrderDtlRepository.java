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
public interface OrderDtlRepository extends JpaRepository<OrderDtl,Integer>{

	OrderDtl save(OrderDtl c);
	List<OrderDtl> findAll();
	void deleteById(int id);
	@Modifying
	@Query("update OrderDtl o set o.prodID = :prodID, o.qty = :qty, o.orderAmt=:orderAmt where o.orderDtlID = :orderDtlID")
	void update(@Param("prodID") int prodID,@Param("qty") int qty,@Param("orderAmt") int orderAmt, @Param("orderDtlID") int orderDtlID);
	OrderDtl findById(int id);
}
