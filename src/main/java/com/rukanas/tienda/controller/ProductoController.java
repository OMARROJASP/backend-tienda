package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Producto;
import com.rukanas.tienda.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias/productos")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping("/")
    public Producto guardarProducto(@RequestBody Producto producto) throws Exception{
        return productoService.guardarProducto(producto);
    }
/*
@GetMapping("/{name}")
    public Producto obtenerProducto(@PathVariable("name") String name){
        return productoService.obtenerProducto(name);
    }

 */

    @GetMapping("producto/{id}")
    public Optional<Producto> obtenerProductoById(@PathVariable("id") Integer id){
        return productoService.obtenerProductoById(id);
    }

    @GetMapping("/")
    public Iterable<Producto> obtenerProductos(){
        return productoService.obtenerProductos();
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@RequestBody Producto producto, @PathVariable("id") Integer id){
        return productoService.actualizarProducto(producto,id);
    }

    @GetMapping("/{id}")
    public Iterable<Producto> obtenerProductosPorCategoria(@PathVariable("id") Integer id){
        return productoService.obtenerProductoCategoria(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable("id") Integer id){
        productoService.eliminarProducto(id);
    }

}