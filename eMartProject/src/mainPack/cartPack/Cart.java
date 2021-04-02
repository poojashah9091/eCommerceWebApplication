package mainPack.cartPack;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int orderid;
	private int custid;
	private String other_shipping_addr;
	private String order_Date;
	private String delivery_Date;
	private String delivery_Option;
	private int order_Dtl_id;
	private int totalDiscount;
	private int ePointsEarned;
	private int totalBill;
	
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getOther_shipping_addr() {
		return other_shipping_addr;
	}
	public void setOther_shipping_addr(String other_shipping_addr) {
		this.other_shipping_addr = other_shipping_addr;
	}
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	public String getDelivery_Date() {
		return delivery_Date;
	}
	public void setDelivery_Date(String delivery_Date) {
		this.delivery_Date = delivery_Date;
	}
	public String getDelivery_Option() {
		return delivery_Option;
	}
	public void setDelivery_Option(String delivery_Option) {
		this.delivery_Option = delivery_Option;
	}
	public int getOrder_Dtl_id() {
		return order_Dtl_id;
	}
	public void setOrder_Dtl_id(int order_Dtl_id) {
		this.order_Dtl_id = order_Dtl_id;
	}
	public int getTotalDiscount() {
		return totalDiscount;
	}
	public void setTotalDiscount(int totalDiscount) {
		this.totalDiscount = totalDiscount;
	}
	public int getePointsEarned() {
		return ePointsEarned;
	}
	public void setePointsEarned(int ePointsEarned) {
		this.ePointsEarned = ePointsEarned;
	}
	public int getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(int totalBill) {
		this.totalBill = totalBill;
	}
	
	
	

}
