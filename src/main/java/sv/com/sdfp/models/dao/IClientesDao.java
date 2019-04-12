package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Clientes;

public interface IClientesDao extends CrudRepository<Clientes, Long> {
	
}
