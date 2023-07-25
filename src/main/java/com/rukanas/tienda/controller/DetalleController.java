package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Detalle;
import com.rukanas.tienda.services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalles")
@CrossOrigin(origins = "http://localhost:5173")
public class DetalleController {
    @Autowired
    private DetalleService detalleService;

    @GetMapping("/")
    public Iterable<Detalle> obtenerDetalles(){
        return detalleService.obtenerDetalle();
    }

    @PostMapping("/")
    public Detalle  guardarDetalle(@RequestBody Detalle detalle){
        return detalleService.guardarDetalle(detalle);
    }
}
