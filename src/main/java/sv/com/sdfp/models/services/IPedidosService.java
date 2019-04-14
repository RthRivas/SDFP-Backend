package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Pedidos;

public interface IPedidosService {
	
	public List<Pedidos> findAll();
	public void save(Pedidos pedidos);
	public Pedidos findOne(Long Id_Pedido);
	public void delete(Long Id_Pedido);
}
