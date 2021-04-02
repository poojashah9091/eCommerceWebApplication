package mainPack.offersPack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Offer {
	private int offerID;
	private int minTransaction;
	private String expiryDate;
	private String promoCode;
	private String offerCondition;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getOfferID() {
		return offerID;
	}

	public void setOfferID(int offerID) {
		this.offerID = offerID;
	}

	public int getMinTransaction() {
		return minTransaction;
	}

	public void setMinTransaction(int minTransaction) {
		this.minTransaction = minTransaction;
	}

	@NotNull
	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@NotNull
	public String getPromoCode() {
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	@NotNull
	public String getOfferCondition() {
		return offerCondition;
	}

	public void setOfferCondition(String offerCondition) {
		this.offerCondition = offerCondition;
	}

}