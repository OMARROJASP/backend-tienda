package com.rukanas.tienda.services;

import com.rukanas.tienda.entity.Categoria;

import java.util.Optional;

public interface CategoriaService {

    Iterable<Categoria> obtenerCategorias();

    Optional<Categoria> obtenerCategoria(Integer id);

    Categoria guardarCategoria(Categoria categoria);

    void eliminarCategoria(Integer id);

    Categoria editarCategoria(Categoria categoria, Integer id);

}
