package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Store {
	private int storeID;
	private String storeAddr;
	private long storePhn;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getStoreID() {
		return storeID;
	}

	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}

	@NotNull
	public String getStoreAddr() {
		return storeAddr;
	}

	public void setStoreAddr(String storeAddr) {
		this.storeAddr = storeAddr;
	}

	@NotNull
	public long getStorePhn() {
		return storePhn;
	}

	public void setStorePhn(long storePhn) {
		this.storePhn = storePhn;
	}

}