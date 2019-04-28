package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.com.sdfp.models.dao.IFacturaDao;
import sv.com.sdfp.models.entities.Factura;

 @Service
public class FacturaServiceImpl implements IFacturacionService {

	@Autowired 
	private IFacturaDao facturaDao;
	 
	@Override
	public List<Factura> findAll() {
		// TODO Auto-generated method stub
		return (List<Factura>)facturaDao.findAll();
	}

	@Override
	public void save(Factura factura) {
		facturaDao.save(factura);
		
	}

	@Override
	public Factura findOne(Long Codigo_Factura) {
		// TODO Auto-generated method stub
		return facturaDao.findById(Codigo_Factura).orElse(null);
	}

	@Override
	public void delete(Long Codigo_Factura) {
		facturaDao.deleteById(Codigo_Factura);
		
	}

}
