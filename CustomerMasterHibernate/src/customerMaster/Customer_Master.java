package customerMaster;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Customer_Master {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int custid;
	private int invoiceOrder_id;
	private String cust_Name;
	private String cust_Address;
	private long cust_PhoneNo;
	private String cust_UserID;
	private String cust_Password;
	private String cust_Email_ID;
	private int eMCardNo;
	private int eMartPoints;
	
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getInvoiceOrder_id() {
		return invoiceOrder_id;
	}
	public void setInvoiceOrder_id(int invoiceOrder_id) {
		this.invoiceOrder_id = invoiceOrder_id;
	}
	
	@NotNull
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	
	@NotNull
	public String getCust_Address() {
		return cust_Address;
	}
	public void setCust_Address(String cust_Address) {
		this.cust_Address = cust_Address;
	}
	
	@NotNull
	public long getCust_PhoneNo() {
		return cust_PhoneNo;
	}
	public void setCust_PhoneNo(long cust_PhoneNo) {
		this.cust_PhoneNo = cust_PhoneNo;
	}
	
	@NotNull
	public String getCust_UserID() {
		return cust_UserID;
	}
	public void setCust_UserID(String cust_UserID) {
		this.cust_UserID = cust_UserID;
	}
	
	@NotNull
	public String getCust_Password() {
		return cust_Password;
	}
	public void setCust_Password(String cust_Password) {
		this.cust_Password = cust_Password;
	}
	
	@NotNull
	public String getCust_Email_ID() {
		return cust_Email_ID;
	}
	public void setCust_Email_ID(String cust_Email_ID) {
		this.cust_Email_ID = cust_Email_ID;
	}
	public int geteMCardNo() {
		return eMCardNo;
	}
	public void seteMCardNo(int eMCardNo) {
		this.eMCardNo = eMCardNo;
	}
	public int geteMartPoints() {
		return eMartPoints;
	}
	public void seteMartPoints(int eMartPoints) {
		this.eMartPoints = eMartPoints;
	}
	

}
