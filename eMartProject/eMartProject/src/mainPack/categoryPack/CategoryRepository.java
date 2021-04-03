package mainPack.categoryPack;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CategoryRepository extends JpaRepository<Category,Integer> 
{
	Category save(Category c);
	List<Category> findAll();
	void deleteById(int cid);
	
	
	@Modifying
	@Query("update Category c set c.catCode = :catCode, c.subCatCode = :subCatCode, c.catName=:catName, c.img_src=:img_src, c.flag=:flag, c.brand=:brand where c.catmasterID = :catmasterID")
	void update(@Param("catCode") String catCode,@Param("subCatCode") String subCatCode,@Param("catName") String catName,@Param("img_src") String img_src,@Param("flag") boolean flag, @Param("brand") String brand, @Param("catmasterID")int catmasterID);
	
	Category findById(int cid);
	
	@Modifying
	@Query("delete from Product p where p.catmasterID = :catmasterID")
	void deleteChildById(@Param("catmasterID")int catmasterID);
	
	
	/*@Modifying
	@Query("select c from Category c join fetch c.Product")
	List<Category> findAllCustom();
	
	@Modifying
	@Query("select c from Category c join fetch c.Product where catmasterID= :catmasterID")
	Category getCategoryByIdCustom(@Param("catmasterID")int catmasterID);*/
}
