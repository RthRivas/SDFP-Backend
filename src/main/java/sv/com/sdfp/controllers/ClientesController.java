package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Clientes;
import sv.com.sdfp.models.services.IClientesService;

@RestController
@RequestMapping("/ast/api/vl/clientes")
public class ClientesController {
	
	@Autowired
	private IClientesService clientesservice;
	
	@RequestMapping("")
	private List<Clientes> findAll(){
		return clientesservice.findAll();
	}

	
}
