package mainPack.invoicePack;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {
	
	private int invoiceOrderID;
	private int custID;
	private String otherShippingAddr;
	private String orderDate;
	private String deliveryDate;
	private String deliveryOption;
	private int orderDtlID;
	private int totalDiscount;
	private int ePointsEarned;
	private int totalBill;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getInvoiceOrderID() {
		return invoiceOrderID;
	}
	public void setInvoiceOrderID(int invoiceOrderID) {
		this.invoiceOrderID = invoiceOrderID;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getOtherShippingAddr() {
		return otherShippingAddr;
	}
	public void setOtherShippingAddr(String otherShippingAddr) {
		this.otherShippingAddr = otherShippingAddr;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryOption() {
		return deliveryOption;
	}
	public void setDeliveryOption(String deliveryOption) {
		this.deliveryOption = deliveryOption;
	}
	public int getOrderDtlID() {
		return orderDtlID;
	}
	public void setOrderDtlID(int orderDtlID) {
		this.orderDtlID = orderDtlID;
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
