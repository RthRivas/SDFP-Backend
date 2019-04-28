package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Proveedores;
import sv.com.sdfp.models.services.IProveedoresService;

@RestController
@RequestMapping("/ast/api/v1/proveedores")
public class ProveedoresController {
	@Autowired
	private IProveedoresService proveedoresService;
	
	@RequestMapping("")
	private List<Proveedores> findAll(){
		return proveedoresService.findAll();
	}
}
