package com.bolsadeideas.springboot.backend.apirest.repository;

import com.bolsadeideas.springboot.backend.apirest.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository <Curso,Long> {
}
