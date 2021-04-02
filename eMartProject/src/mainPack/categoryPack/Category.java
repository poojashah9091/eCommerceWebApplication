package mainPack.categoryPack;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import mainPack.productPack.Product;

@Entity
public class Category
{
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int catmasterID;
	
	@NotNull
	private String catCode;
	
	@NotNull
	private String catName;
	
	@NotNull
	private boolean flag;
	
	private String brand;
	private String img_src;
	private String subCatCode;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="catmasterID",referencedColumnName="catmasterID")
	private List<Product> Product;
	
	
	public int getCatmasterID() {
		return catmasterID;
	}
	
	public void setCatmasterID(int catmasterID) {
		this.catmasterID = catmasterID;
	}
	
	
	public String getCatCode() {
		return catCode;
	}
	
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	
	public String getSubCatCode() {
		return subCatCode;
	}
	
	public void setSubCatCode(String subCatCode) {
		this.subCatCode = subCatCode;
	}
	
	
	public String getCatName() {
		return catName;
	}
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	

	public String getImg_src() {
		return img_src;
	}
	
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}