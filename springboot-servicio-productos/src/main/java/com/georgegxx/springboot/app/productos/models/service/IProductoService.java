package com.georgegxx.springboot.app.productos.models.service;

import com.georgegxx.springboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}
