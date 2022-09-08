package pe.edu.upeu.clase01.controller;

import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.clase01.entity.Shippers;
import pe.edu.upeu.clase01.service.ShippersService;

import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@RestController

public class ShippersController {
	
	@Autowired
	private ShippersService shippersService;
	
	@GetMapping("/shippers")
	public List<Shippers> getList(){
		return shippersService.readAll();
	}

}
