package customerMaster;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer_Master, Integer> {

	List<Customer_Master> findAll();

	Customer_Master findById(int custId);

	Customer_Master save(Customer_Master c);

	void deleteById(int custId);
	
	
	@Modifying
	@Query("update Customer_Master c set c.invoiceOrder_id = :invoiceOrder_id, c.cust_Name = :cust_Name, c.cust_Address=:cust_Address, c.cust_PhoneNo=:cust_PhoneNo, c.cust_UserID=:cust_UserID, c.cust_Password=:cust_Password, c.cust_Email_ID=:cust_Email_ID, c.eMCardNo=:eMCardNo, c.eMartPoints=:eMartPoints where c.custid = :custid")
	void update(@Param("invoiceOrder_id") int invoiceOrder_id, @Param("cust_Name") String cust_Name,
			@Param("cust_Address") String cust_Address, @Param("cust_PhoneNo") long cust_PhoneNo,
			@Param("cust_UserID") String cust_UserID, @Param("cust_Password") String cust_Password, @Param("cust_Email_ID") String cust_Email_ID, @Param("eMCardNo") int eMCardNo, @Param("eMartPoints") int eMartPoints, @Param("custid") int custid);

	

}
