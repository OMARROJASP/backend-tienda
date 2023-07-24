package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Factura;
import com.rukanas.tienda.repository.FacturaRepository;
import com.rukanas.tienda.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public Iterable<Factura> obtenerFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura guardarFactura(Factura factura) {
        Factura factura1 = facturaRepository.save(factura);
        return factura1;
    }
}
