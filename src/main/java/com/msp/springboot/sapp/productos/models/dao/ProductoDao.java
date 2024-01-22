package com.msp.springboot.sapp.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.msp.springboot.sapp.productos.models.entity.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}
