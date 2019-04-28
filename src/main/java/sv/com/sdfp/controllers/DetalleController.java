package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Detalle;
import sv.com.sdfp.models.services.IDetalleService;

@RestController
@RequestMapping("/ast/api/vl/detalle")
public class DetalleController {
	
	@Autowired
	private IDetalleService detalleservice;
	
	@RequestMapping("")
	private List<Detalle> findAll(){
		return detalleservice.findAll();
	}

}
