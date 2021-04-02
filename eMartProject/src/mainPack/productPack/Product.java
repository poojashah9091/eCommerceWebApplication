package mainPack.productPack;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

@Entity
public class Product {
	
	
	private int prodID;
	private int catmasterID;
	private String prodShortDesc;
	private int mrpPrice;
	private int cardholdersPrice;
	private int pointsToBeRedm;
	private String productImagePath;
	private int offerId;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public int getCatmasterID() {
		return catmasterID;
	}
	public void setCatmasterID(int catmasterID) {
		this.catmasterID = catmasterID;
	}
	public String getProdShortDesc() {
		return prodShortDesc;
	}
	public void setProdShortDesc(String prodShortDesc) {
		this.prodShortDesc = prodShortDesc;
	}
	public int getMrpPrice() {
		return mrpPrice;
	}
	public void setMrpPrice(int mrpPrice) {
		this.mrpPrice = mrpPrice;
	}
	public int getCardholdersPrice() {
		return cardholdersPrice;
	}
	public void setCardholdersPrice(int cardholdersPrice) {
		this.cardholdersPrice = cardholdersPrice;
	}
	public int getPointsToBeRedm() {
		return pointsToBeRedm;
	}
	public void setPointsToBeRedm(int pointsToBeRedm) {
		this.pointsToBeRedm = pointsToBeRedm;
	}
	public String getProductImagePath() {
		return productImagePath;
	}
	public void setProductImagePath(String productImagePath) {
		this.productImagePath = productImagePath;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	
	
	
	
}
	

	