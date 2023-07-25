package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Categoria;
import com.rukanas.tienda.entity.Producto;
import com.rukanas.tienda.repository.CategoriaRepository;
import com.rukanas.tienda.repository.ProductoRepository;
import com.rukanas.tienda.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Producto guardarProducto(Producto producto) throws Exception {
        Producto producto1 = productoRepository.findByNombre(producto.getNombre());
        if(producto1 != null){
            System.out.println("El producto ya existe");
            throw new Exception("El producto ya esta presente");
        }
        else {
            producto1 = productoRepository.save(producto);
        }
        return producto1;
    }

    @Override
    public Producto obtenerProducto(String producto) {
        return productoRepository.findByNombre(producto);
    }



    @Override
    public Iterable<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> obtenerProductoById(Integer productoId) {
        return productoRepository.findById(productoId);
    }

    @Override
    public Producto actualizarProducto(Producto producto, Integer id)  {
        Optional<Producto> productoOptional = productoRepository.findById(id);

       if(!productoOptional.isPresent()){return  null;}

        Producto productoUpdate = productoOptional.get();
       if(producto.getNombre() != null){
           productoUpdate.setNombre(producto.getNombre());
       }
        if(producto.getPrecio() != null){
            productoUpdate.setPrecio(producto.getPrecio());
        }
        if(producto.getStock() != null){
            productoUpdate.setStock(producto.getStock());
        }

        if(producto.getCategoria() != null){
            productoUpdate.setCategoria(producto.getCategoria());
        }

        Producto finalProduct = productoRepository.save(productoUpdate);

        return finalProduct;
    }

    @Override
    public Iterable<Producto> obtenerProductoCategoria(Integer id) {

      return productoRepository.findByCategoria(id);
    }

    @Override
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }

}
