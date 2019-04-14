package sv.com.sdfp.models.services;

import java.util.List;

import sv.com.sdfp.models.entities.Categorias;

public interface ICategoriasService {
	public List<Categorias> findAll();
	public void save (Categorias categorias);
	public Categorias findOne(Long Id_Categoria);
	public void delete(Long Id_Categoria);

}
