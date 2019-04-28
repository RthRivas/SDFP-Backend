package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Pedidos;
import sv.com.sdfp.models.services.IPedidosService;

@RestController
@RequestMapping("/ast/api/v1/pedidos")
public class PedidosController {
	
	@Autowired
	private IPedidosService pedidosService;
	
	@RequestMapping("")
	private List<Pedidos> findAll() {
		return pedidosService.findAll();
	}
}
