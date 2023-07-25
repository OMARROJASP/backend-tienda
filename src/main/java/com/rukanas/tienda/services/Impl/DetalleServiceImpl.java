package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Detalle;
import com.rukanas.tienda.repository.DetalleRepository;
import com.rukanas.tienda.services.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class DetalleServiceImpl  implements DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    @Override
    public Iterable<Detalle> obtenerDetalle() {
        return detalleRepository.findAll();
    }

    @Override
    public Detalle guardarDetalle(Detalle detalle) {
        return detalleRepository.save(detalle);
    }
}
