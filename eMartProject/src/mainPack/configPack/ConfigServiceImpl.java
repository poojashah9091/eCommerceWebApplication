package mainPack.configPack;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ConfigServiceImpl implements ConfigService{
	@Autowired
	ConfigRepository repository;

	@Override
	public void addConfig(Config p) {
		repository.save(p);
		
	}

	@Override
	public List<Config> getConfig() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void delete(int cid) {
		// TODO Auto-generated method stub
		repository.deleteById(cid);
		
	}

	@Override
	public void update(Config c, int cid) {
		// TODO Auto-generated method stub
		repository.update(c.getConfigName(),cid);
	}

	@Override
	public Config getConfig(int cid) {
		// TODO Auto-generated method stub
		return repository.findById(cid);
	}

}
