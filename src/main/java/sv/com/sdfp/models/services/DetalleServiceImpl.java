package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IDetalleDao;
import sv.com.sdfp.models.entities.Detalle;

@Service
public class DetalleServiceImpl implements IDetalleService{

	@Autowired
	private IDetalleDao detalleDao;
	
	@Override
	@Transactional
	public List<Detalle> findAll() {
		// TODO Auto-generated method stub
		return (List<Detalle>) detalleDao.findAll();
	}

	@Override
	@Transactional
	public void save(Detalle detalle) {
		// TODO Auto-generated method stub
		detalleDao.save(detalle);
	}

	@Override
	public Detalle findOne(Long Id_Detalle) {
		// TODO Auto-generated method stub
		return detalleDao.findById(Id_Detalle).orElse(null);
	}

	@Override
	@Transactional
	public void delte(Long Id_Detalle) {
		// TODO Auto-generated method stub
		detalleDao.deleteById(Id_Detalle);
		
	}

}
