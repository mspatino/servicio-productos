package com.msp.springboot.sapp.productos.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.msp.springboot.sapp.productos.models.entity.Producto;
import com.msp.springboot.sapp.productos.models.service.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private Environment env;
	
	//*Obtenemos el puerto usando la anotacion Value,
	//*usando la propiedad server.por del application.properties
	@Value("${server.port}")
	private Integer port;
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll().stream()
				.map(prod -> {
					//prod.setPort(Integer.parseInt(env.getProperty("local.server.port")));
					prod.setPort(port);
					return prod;
				}).collect(Collectors.toList());
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		//return productoService.findById(id);
		Producto producto =  productoService.findById(id);
		
		//producto.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		producto.setPort(port);
		return producto;
	}

}
