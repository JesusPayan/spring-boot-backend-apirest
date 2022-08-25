package com.bolsadeideas.springboot.backend.apirest.controller;

import com.bolsadeideas.springboot.backend.apirest.entity.Curso;
import com.bolsadeideas.springboot.backend.apirest.repository.CursoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class CursoController {
    CursoRepository cursoRepository;
    public CursoController(CursoRepository innerCursoRepository){
        this.cursoRepository = innerCursoRepository;
    }

 public List<Curso>findAll(){
        return this.cursoRepository.findAll();
    }

}
