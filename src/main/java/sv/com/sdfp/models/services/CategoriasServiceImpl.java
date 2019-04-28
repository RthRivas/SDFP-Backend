package sv.com.sdfp.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.sdfp.models.dao.ICategoriasDao;
import sv.com.sdfp.models.entities.Categorias;

@Service
public class CategoriasServiceImpl implements ICategoriasService{

	@Autowired
	private ICategoriasDao categoriasDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Categorias> findAll() {
		// TODO Auto-generated method stub
		return (List<Categorias>) categoriasDao.findAll();
	}

	@Override
	@Transactional
	public void save(Categorias categorias) {
		// TODO Auto-generated method stub
		categoriasDao.save(categorias);
	}

	@Override
	public Categorias findOne(Long Id_Categoria) {
		// TODO Auto-generated method stub
		return categoriasDao.findById(Id_Categoria).orElse(null);
	}

	@Override
	public void delete(Long Id_Categoria) {
		// TODO Auto-generated method stub
		categoriasDao.deleteById(Id_Categoria);
	}
	

}
