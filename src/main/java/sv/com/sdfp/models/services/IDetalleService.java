package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Detalle;

public interface IDetalleService {
	public List<Detalle> findAll();
	public void save(Detalle detalle);
	public Detalle findOne(Long Id_Detalle);
	public void delte(Long Id_Detalle);

}
