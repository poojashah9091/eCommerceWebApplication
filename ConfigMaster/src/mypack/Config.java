package mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Config {

	private int configID;
	private String configName;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	public int getConfigID() {
		return configID;
	}
	public void setConfigID(int configID) {
		this.configID = configID;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	
}
