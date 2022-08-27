package com.bolsadeideas.springboot.backend.apirest.repository;


import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends CrudRepository<Cliente,Long> {
//esta interfaz es la que permite heredar los metodos de la clase JpaRepository
}
