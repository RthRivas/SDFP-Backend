package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IProveedoresDao;
import sv.com.sdfp.models.entities.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService {

	@Autowired
	private IProveedoresDao proveedoresDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Proveedores> findAll(){
		return (List<Proveedores>) proveedoresDao.findAll();
	}
	@Override
	@Transactional(readOnly=true)
	public Proveedores findOne(Long Id_Proveedor) {
		return proveedoresDao.findById(Id_Proveedor).orElse(null);
	}
	
	@Override
	@Transactional
	public void save(Proveedores proveedores) {
		// TODO Auto-generated method stub
		proveedoresDao.save(proveedores);
	}
	
	@Override
	@Transactional
	public void delete(Long Id_Proveedores) {
		// TODO Auto-generated method stub
		proveedoresDao.deleteById(Id_Proveedores);
		
	}
	
	
}
