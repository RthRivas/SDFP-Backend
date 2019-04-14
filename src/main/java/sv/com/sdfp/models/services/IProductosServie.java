package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Productos;

public interface IProductosServie {
	public List<Productos> findAll();
	public void save(Productos productos);
	public Productos findOne(Long Id_Productos);
	public void delete (Long Id_Productos);
}
