package com.rukanas.tienda.services;

import com.rukanas.tienda.entity.Detalle;

public interface DetalleService {
    Iterable<Detalle> obtenerDetalle();

    Detalle guardarDetalle(Detalle detalle);
}
