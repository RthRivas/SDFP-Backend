package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Categorias;

public interface ICategoriasDao extends CrudRepository<Categorias, Long> {

}
