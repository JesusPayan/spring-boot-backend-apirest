package com.bolsadeideas.springboot.backend.apirest.controller;
import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;
import com.bolsadeideas.springboot.backend.apirest.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;
// es de donde vienen los request al servidor backend, tambien permite manipular los permisos, los metodos http permitidos, las cabecertas etvc.
@CrossOrigin(origins = {"http://localhost:4200/"})
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClientRepository clientRepository;

public ClienteController(ClientRepository innerRepository){
	this.clientRepository = innerRepository;
}


	@GetMapping("/clientes")
	public List<Cliente> findAll() {
		return clientRepository.findAll();
	}

}
