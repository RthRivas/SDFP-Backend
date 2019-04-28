package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Productos;
import sv.com.sdfp.models.services.IProductosService;

@RestController
@RequestMapping("/ast/api/v1/productos")
public class ProductosController {
	
	@Autowired
	private IProductosService productosService;
	
	@RequestMapping("")
	private List<Productos> findAll(){
		return productosService.findAll();
	}
}
