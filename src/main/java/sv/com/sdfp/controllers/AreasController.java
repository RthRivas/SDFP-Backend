package sv.com.sdfp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.sdfp.models.entities.Areas;
import sv.com.sdfp.models.services.IAreasService;

@RestController
@RequestMapping("/ast/api/vl/detalle")
public class AreasController {
	
	@Autowired
	private IAreasService areasservice;
	
	@RequestMapping("")
	private List<Areas> findAll(){
		return areasservice.findAll();
	}

}
