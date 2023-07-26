package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Detalle;
import com.rukanas.tienda.repository.DetalleRepository;
import com.rukanas.tienda.services.DetalleSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl implements DetalleSerice {
    @Autowired
    private DetalleRepository detalleRepository;

    @Override
    public Iterable<Detalle> obtenerDetalles() {
        return detalleRepository.findAll();
    }
}
