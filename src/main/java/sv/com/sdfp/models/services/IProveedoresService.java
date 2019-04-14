package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Proveedores;

public interface IProveedoresService {

	public List<Proveedores> findAll();
	public void guardar(Proveedores proveedores);
	public Proveedores findOne(Long Id_Proveedor);
	public void delete(Long Id_Proveedores);
	}
