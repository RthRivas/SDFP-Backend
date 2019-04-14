package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Factura;

public interface IFacturacionService {

	public List<Factura> findAll();
	public void save(Factura factura);
	public Factura findOne(Long Codigo_Factura);
	public void delete(Long Codigo_Factura);
	
}
