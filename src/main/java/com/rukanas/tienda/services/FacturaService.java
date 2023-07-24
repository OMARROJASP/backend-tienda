package com.rukanas.tienda.services;

import com.rukanas.tienda.entity.Factura;

import java.util.Optional;

public interface FacturaService {
    Iterable<Factura> obtenerFacturas();

    Factura guardarFactura(Factura factura);

}
