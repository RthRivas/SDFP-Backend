package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Pedidos;

public interface IPedidosDao extends CrudRepository<Pedidos, Long>{

}
