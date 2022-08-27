package com.bolsadeideas.springboot.backend.apirest.service;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class IClienteServiceImp implements IClienteService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional
    public List<Cliente> findAll() {
        return (List<Cliente>) clientRepository.findAll();
    }
    /*Ya que el metodo FindById en esta implementacion se castea al Tipo de Datos Entity
    * */
    @Override
    @Transactional(readOnly = true)
    public Cliente findById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Cliente cliente) {
            clientRepository.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
        clientRepository.delete(cliente);
    }
    @Override
    public void deleteById(Long id){
        clientRepository.deleteById(id);
    }

}
