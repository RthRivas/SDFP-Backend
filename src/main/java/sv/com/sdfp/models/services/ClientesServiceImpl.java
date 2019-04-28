package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.IClientesDao;
import sv.com.sdfp.models.entities.Clientes;

@Service 
public class ClientesServiceImpl implements IClientesService {

	@Autowired
	private IClientesDao clientesDao;

	@Override
	@Transactional(readOnly=true)
	public List<Clientes> findAll() {
		// TODO Auto-generated method stub
		return (List<Clientes>) clientesDao.findAll();
	}

	@Override
	@Transactional
	public void save(Clientes clientes) {
		// TODO Auto-generated method stub
		clientesDao.save(clientes);
		
	}

	@Override
	public Clientes findOne(Long Id_Cliente) {
		// TODO Auto-generated method stub
		return clientesDao.findById(Id_Cliente).orElse(null);
	}

	@Override
	public void delete(Long Id_Cliente) {
		// TODO Auto-generated method stub
		clientesDao.deleteById(Id_Cliente);
	}
	
}
