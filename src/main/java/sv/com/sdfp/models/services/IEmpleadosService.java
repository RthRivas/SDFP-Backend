package sv.com.sdfp.models.services;

import java.util.List;
import sv.com.sdfp.models.entities.Empleados;

public interface IEmpleadosService {

	public List<Empleados> findAll();
	public void save(Empleados empleados);
	public Empleados findOne(Long Id_Empleado);
	public void delete(Long Id_Empleado);
}
