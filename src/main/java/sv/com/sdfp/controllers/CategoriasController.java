package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Categorias;
import sv.com.sdfp.models.services.ICategoriasService;

@RestController
@RequestMapping("/ast/api/vl/categorias")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService categoriasservice;
	
	@RequestMapping("")
	private List<Categorias> findAll(){
		return categoriasservice.findAll();
	}

}
