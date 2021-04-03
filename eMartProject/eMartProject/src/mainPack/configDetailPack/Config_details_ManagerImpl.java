package mainPack.configDetailPack;

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
	public void update_config_details(Config_details cd, int id) {
		cdr.update(cd.getProduct_id(), cd.getproduct_details(),  cd.getConfig_id(), id);
		
	}

	@Override
	public Config_details get_config_details_ById(int id) {
		Config_details conf = cdr.findById(id);
		if(conf==null)
			System.out.println("No Configuration with given id present");
		return conf;
	}

}
