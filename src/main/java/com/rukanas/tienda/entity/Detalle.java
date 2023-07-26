package com.rukanas.tienda.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "detalles")
public class Detalle implements Serializable {
    @EmbeddedId
    private ProductoFacturaId id;

    @ManyToOne
    @JoinColumn(name = "factura_id",  insertable = false, updatable = false)
    @MapsId("facturaId")
    @ToString.Exclude
    private Factura factura;

    private int cantidad;
    private int num_detalle;



    public ProductoFacturaId getId() {
        return id;
    }

    public void setId(ProductoFacturaId id) {
        this.id = id;
    }


    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getNum_detalle() {
        return num_detalle;
    }

    public void setNum_detalle(int num_detalle) {
        this.num_detalle = num_detalle;
    }
}
