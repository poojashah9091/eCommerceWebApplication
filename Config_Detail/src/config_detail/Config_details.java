package config_detail;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Config_details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int config_detail_id;
	@NotNull
	private int config_id;
	@NotNull
	private String config_details;
	@NotNull
	private int product_id;
	
	
	public int getConfig_detail_id() {
		return config_detail_id;
	}
	public int getConfig_id() {
		return config_id;
	}
	public String getConfig_details() {
		return config_details;
	}
	public int getProduct_id() {
		return product_id;
	}
	
	
	public void setConfig_detail_id(int config_detail_id) {
		this.config_detail_id = config_detail_id;
	}
	public void setConfig_id(int config_id) {
		this.config_id = config_id;
	}
	public void setConfig_details(String config_details) {
		this.config_details = config_details;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
}
