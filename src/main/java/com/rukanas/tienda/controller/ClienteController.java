package com.rukanas.tienda.controller;

import com.rukanas.tienda.entity.Cliente;
import com.rukanas.tienda.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:5173")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    private Iterable<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }

    @PostMapping("/")
    private Cliente guardarClientes(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

}
