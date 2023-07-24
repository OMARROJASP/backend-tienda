package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Factura;
import com.rukanas.tienda.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturas")
@CrossOrigin(origins = "http://localhost:5173")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/")
    public Iterable<Factura> obtenerFacturas(){
        return facturaService.obtenerFacturas();
    }

    @PostMapping("/")
    public Factura guardarFactura(@RequestBody Factura factura){
        return  facturaService.guardarFactura(factura);
    }

}
