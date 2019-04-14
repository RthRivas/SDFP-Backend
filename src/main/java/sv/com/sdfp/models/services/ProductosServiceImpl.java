package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IProductosDao;
import sv.com.sdfp.models.entities.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	private IProductosDao productosDao;
	@Override
	@Transactional(readOnly=true)
	public List<Productos> findAll() {
		// TODO Auto-generated method stub
		return (List<Productos>) productosDao.findAll();
	}

	@Override
	@Transactional
	public void save(Productos productos) {
		// TODO Auto-generated method stub
		productosDao.save(productos);
	}

	@Override
	@Transactional
	public Productos findOne(Long Id_Productos) {
		// TODO Auto-generated method stub
		return productosDao.findById(Id_Productos).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long Id_Productos) {
		// TODO Auto-generated method stub
		productosDao.deleteById(Id_Productos);
	}

	
}
