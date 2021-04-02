package config_detail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Config_details_ManagerImpl implements Config_details_Manager {

	@Autowired
	Config_details_Repository cdr;
	
	@Override
	public Config_details add_Config_detail(Config_details cd) {
		if(cd!=null)
			cdr.save(cd);
		else
			System.out.println("Please enter the config details to continue!");
		return cd;
	}

	@Override
	public List<Config_details> getAll_Config_details() {
		return cdr.findAll();
	}

	@Override
	public Config_details delete_config_details(int id) {	
		Config_details conf = get_config_details_ById(id);
		if(conf!=null) 
			cdr.deleteById(id);
		return conf;
	}

	@Override
	public Config_details update_config_details(Config_details cd, int id) {
		if(cd==null)
			System.out.println("Please provide values for config_details to continue");
		cdr.update(cd.getConfig_detail_id(), cd.getProduct_id(), cd.getConfig_details(),  cd.getConfig_id());
		//System.out.println(i);
		return get_config_details_ById(id);
	}

	@Override
	public Config_details get_config_details_ById(int id) {
		Config_details conf = cdr.findById(id);
		if(conf==null)
			System.out.println("No Configuration with given id present");
		return conf;
	}

	/*@Override
	public List<Config_details> get_confif_details_By_ProductId(int id) {
		List<Config_details> product_details = cdr.findAllById(id);
		return product_details;
	}*/

}
