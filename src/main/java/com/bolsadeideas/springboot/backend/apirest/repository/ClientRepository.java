package com.bolsadeideas.springboot.backend.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

import java.util.List;

public interface ClientRepository extends JpaRepository <Cliente,Long>{
    public List<Cliente> findAll();
}
