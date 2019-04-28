package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Cargos;
import sv.com.sdfp.models.services.ICargosService;

@RestController
@RequestMapping("/ast/api/vl/cargos")
public class CargosController {
	
	@Autowired
	private ICargosService cargosservice;
	
	@RequestMapping("")
	private List<Cargos> findAll(){
		return cargosservice.findAll();
	}

}
