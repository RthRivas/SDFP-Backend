package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Empleados;
import sv.com.sdfp.models.services.IEmpleadosService;

@RestController
@RequestMapping("/ast/api/v1/empleados")
public class EmpleadosController {
	@Autowired
	private IEmpleadosService empleadosService;
	
	@RequestMapping("")
	private List<Empleados> findAll()
	{
		return empleadosService.findAll();
	}

}
