package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.ICargosDao;
import sv.com.sdfp.models.entities.Cargos;

@Service
public class CargosServiceImpl implements ICargosService{

	@Autowired
	private ICargosDao cargosDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cargos> findAll() {
		// TODO Auto-generated method stub
		return (List<Cargos>) cargosDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cargos cargos) {
		// TODO Auto-generated method stub
		cargosDao.save(cargos);
		
	}

	@Override
	@Transactional
	public Cargos findOne(Long Id_Cargo) {
		return cargosDao.findById(Id_Cargo).orElse(null);
		}

	@Override
	@Transactional
	public void delete(Long Id_Cargo) {
		cargosDao.deleteById(Id_Cargo);
		
	}

}
