package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
