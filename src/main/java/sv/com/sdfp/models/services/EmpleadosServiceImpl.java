package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IEmpleadosDao;
import sv.com.sdfp.models.entities.Empleados;

@Service
public class EmpleadosServiceImpl implements IEmpleadosService{
	
	@Autowired
	private IEmpleadosDao empleadosDao;

	@Override
	@Transactional
	public List<Empleados> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleados>) empleadosDao.findAll();
	}

	@Override
	public void save(Empleados empleados) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleados);
	}

	@Override
	public Empleados findOne(Long Id_Empleado) {
		// TODO Auto-generated method stub
		return empleadosDao.findById(Id_Empleado).orElse(null);
	}

	@Override
	public void delete(Long Id_Empleado) {
		// TODO Auto-generated method stub
		empleadosDao.deleteById(Id_Empleado);
		
	}
	
	

}
