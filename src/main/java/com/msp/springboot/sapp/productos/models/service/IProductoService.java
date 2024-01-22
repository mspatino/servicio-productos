package com.msp.springboot.sapp.productos.models.service;

import java.util.List;

import com.msp.springboot.sapp.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> findAll();
	public Producto findById(Long id);
	

}
