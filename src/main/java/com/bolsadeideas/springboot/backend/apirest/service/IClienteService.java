package com.bolsadeideas.springboot.backend.apirest.service;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

import java.util.List;
/*
    Esta interface genera las firmas de los metodos que se implementaran en
    la clase ServiceImple
 */
public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    public void save(Cliente cliente);
    public void delete(Cliente cliente);
    public void deleteById(Long id);

}
