package com.bolsadeideas.springboot.backend.apirest.dao;

import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao  extends CrudRepository<Cliente,Long> {
}
