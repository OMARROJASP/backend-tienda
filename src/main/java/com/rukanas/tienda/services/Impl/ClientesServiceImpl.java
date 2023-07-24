package com.rukanas.tienda.services.Impl;

import com.rukanas.tienda.entity.Cliente;
import com.rukanas.tienda.repository.ClienteRepository;
import com.rukanas.tienda.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;


    @Override
    public Iterable<Cliente> obtenerClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
