package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Cargos;;

public interface ICargosService {
	public List<Cargos> findAll();
	public void save(Cargos cargos);
	public Cargos findOne(Long Id_Cargo);
	public void delete(Long Id_Cargo);

}
