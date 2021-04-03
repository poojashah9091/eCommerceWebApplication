package mainPack.orderDetailPack;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderDtl {

	private int orderDtlID;
	private int prodID;
	private int qty;
	private int orderAmt;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getOrderDtlID() {
		return orderDtlID;
	}
	public void setOrderDtlID(int orderDtlID) {
		this.orderDtlID = orderDtlID;
	}
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getOrderAmt() {
		return orderAmt;
	}
	public void setOrderAmt(int orderAmt) {
		this.orderAmt = orderAmt;
	}
	
	

}
