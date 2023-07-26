package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Detalle;
import com.rukanas.tienda.services.DetalleSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detalles")
@CrossOrigin(origins = "http://localhost:5173")
public class DetalleController {

    @Autowired
    private DetalleSerice detalleSerice;

    @GetMapping("/")
    public Iterable<Detalle> obtenerDetalles(){
        return detalleSerice.obtenerDetalles();
    }

}
