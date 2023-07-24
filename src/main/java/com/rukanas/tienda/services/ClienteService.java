package com.rukanas.tienda.services;

import com.rukanas.tienda.entity.Cliente;

public interface ClienteService {
    Iterable<Cliente> obtenerClientes();

    Cliente guardarCliente(Cliente cliente);
}
