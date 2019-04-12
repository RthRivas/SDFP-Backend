package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Productos;

public interface IProductosDao extends CrudRepository<Productos, Long>{

}
