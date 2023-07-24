package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Categoria;
import com.rukanas.tienda.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public Iterable<Categoria> obtenerCategorias(){

        return categoriaService.obtenerCategorias();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> obtenerCategoria(@PathVariable("id") Integer id){
        return categoriaService.obtenerCategoria(id);
    }

    @PostMapping("/")
    public Categoria guardarCategoria(@RequestBody Categoria categoria){
        return categoriaService.guardarCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria editarCategoria(@RequestBody Categoria categoria, @PathVariable("id") Integer id ){
        return categoriaService.editarCategoria(categoria, id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCategoria(@PathVariable("id") Integer id){
        categoriaService.eliminarCategoria(id);
    }
}
