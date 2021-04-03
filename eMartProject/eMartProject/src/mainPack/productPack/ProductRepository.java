package mainPack.productPack;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Integer> 
{
	Product save(Product p);
	List<Product> findAll();
	void deleteById(int pid);
	@Modifying
	@Query("update Product p set p.catmasterID = :catmasterID,p.prodShortDesc = :prodShortDesc, p.mrpPrice=:mrpPrice, p.cardholdersPrice=:cardholdersPrice, p.pointsToBeRedm=:pointsToBeRedm, p.productImagePath=:productImagePath,p.offerId=:offerId where p.prodID = :prodID ")
	void update( @Param("catmasterID")int catmasterID,@Param("prodShortDesc") String prodShortDesc,@Param("mrpPrice") int mrpPrice,@Param("cardholdersPrice") int cardholdersPrice,@Param("pointsToBeRedm") int pointsToBeRedm, @Param("productImagePath") String productImagePath,@Param("offerId") int offerId,@Param("prodID") int prodID);
	Product findById(int pid);
}
