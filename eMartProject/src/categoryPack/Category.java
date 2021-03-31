package categoryPack;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;


@Entity
public class Category
{
	private int catmasterID;
	private String catCode;
	private String subCatCode;
	private String catName;
	private String img_src;
	private boolean flag;
	private String brand;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getCatmasterID() {
		return catmasterID;
	}
	
	public void setCatmasterID(int catmasterID) {
		this.catmasterID = catmasterID;
	}
	
	@NotNull
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
	
	@NotNull
	public String getCatName() {
		return catName;
	}
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	@NotNull
	public String getImg_src() {
		return img_src;
	}
	
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	
	@NotNull
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@NotNull
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}