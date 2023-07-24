package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Categoria;
import com.rukanas.tienda.repository.CategoriaRepository;
import com.rukanas.tienda.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Iterable<Categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> obtenerCategoria(Integer id) {
        return categoriaRepository.findById(id);
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {

        Categoria categoria1 = categoriaRepository.save(categoria);
        return categoria1;
    }

    @Override
    public void eliminarCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }

    @Override
    public Categoria editarCategoria(Categoria categoria, Integer id) {
        Optional<Categoria> categoriaOptional = categoriaRepository.findById(id);
        if(!categoriaOptional.isPresent()){return null;}

        Categoria categoriaUpdateOptional = categoriaOptional.get();
        if(categoria.getNombre() != null){
            categoriaUpdateOptional.setNombre(categoria.getNombre());
        }
        if(categoria.getDescripciona() != null){
            categoriaUpdateOptional.setDescripciona(categoria.getDescripciona());
        }
        Categoria categoriaUpdate = categoriaRepository.save(categoriaUpdateOptional);

        return categoriaUpdate;
    }
}
