package com.rukanas.tienda.repository;

import com.rukanas.tienda.entity.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Integer> {
}
