package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Factura;
import sv.com.sdfp.models.services.IFacturacionService;

@RestController
@RequestMapping("/ast/api/v1/facturas")
public class FacturaController {
	 
	@Autowired
	private IFacturacionService facturasService;
	
	@RequestMapping("")
	private List<Factura> findAll()
	{
		return facturasService.findAll();
	}
}
