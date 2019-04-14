package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Clientes;

public interface IClientesService {
	public List<Clientes> findAll();
	public void save (Clientes clientes);
	public Clientes findOne(Long Id_Cliente);
	public void delete(Long Id_Cliente);

}
