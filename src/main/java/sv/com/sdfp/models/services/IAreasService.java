package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Areas;

public interface IAreasService {
	
	public List<Areas> findAll();
	public void save (Areas areas);
	public Areas findOne(Long Id_Area);
	public void delete(Long Id_Area);
}
