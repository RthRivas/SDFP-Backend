package sv.com.sdfp.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.sdfp.models.entities.Empleados;

public interface IEmpleadosDao extends CrudRepository<Empleados, Long>{

}
