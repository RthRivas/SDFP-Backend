package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IAreasDao;
import sv.com.sdfp.models.entities.Areas;

@Service
public class AreasServiceImpl implements IAreasService{

	@Autowired
	private IAreasDao areasDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Areas> findAll() {
		// TODO Auto-generated method stub
		return (List<Areas>) areasDao.findAll();
	}

	@Override
	@Transactional
	public void save(Areas areas) {
		// TODO Auto-generated method stub
		areasDao.save(areas);
		
	}

	@Override
	@Transactional
	public Areas findOne(Long Id_Area) {
		// TODO Auto-generated method stub
		return areasDao.findById(Id_Area).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long Id_Area) {
		// TODO Auto-generated method stub
		areasDao.deleteById(Id_Area);
		
	}

}
