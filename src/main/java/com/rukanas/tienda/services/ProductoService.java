package com.rukanas.tienda.services;

import com.rukanas.tienda.entity.Categoria;
import com.rukanas.tienda.entity.Producto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductoService {
    public Producto guardarProducto(Producto producto) throws Exception;

    public Producto obtenerProducto(String producto);

    Iterable<Producto> obtenerProductos();

    Optional<Producto> obtenerProductoById(Integer productoId);

    Producto actualizarProducto(Producto producto, Integer id);

    Iterable<Producto> obtenerProductoCategoria(Integer id);

    void eliminarProducto(Integer id);
}
