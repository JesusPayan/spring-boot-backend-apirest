package com.bolsadeideas.springboot.backend.apirest.controller;


import com.bolsadeideas.springboot.backend.apirest.entity.Cliente;


import com.bolsadeideas.springboot.backend.apirest.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;



import java.util.Date;
import java.util.List;


// es de donde vienen los request al servidor backend, tambien permite manipular los permisos, los metodos http permitidos, las cabecertas etvc.
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired(required=true) // inyecta la dependencia

	/*Se crea un objeto de la interfaz service para poder acceder a sus metodos.*/
	private IClienteService clienteService;

	public ClienteController(IClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping(path = "/clientes")
	@ResponseStatus(HttpStatus.OK)
	public List<Cliente> showClients(){
		return this.clienteService.findAll();
	}
	@GetMapping(path = "/clientes/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Cliente showClientById(@PathVariable Long id){
		return this.clienteService.findById(id);
	}

	@PostMapping(path = "/clientes")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente addClient(@RequestBody  Cliente cliente){
		cliente.setCreateAt(new Date());
		this.clienteService.save(cliente);
		return cliente;
	}


	@PutMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente updateClient(@RequestBody Cliente cliente, @PathVariable Long id){
		Cliente current = clienteService.findById(id);
		current.setCreateAt(new Date());
		current.setApellido(cliente.getApellido());
		current.setEmail(cliente.getEmail());
		current.setNombre(cliente.getNombre());
		this.clienteService.save(current);
		return current;
	}

	@DeleteMapping("/clientes/cliente")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@RequestBody Cliente cliente){
		this.clienteService.delete(cliente);
	}
	@DeleteMapping("/clientes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Long id){
		this.clienteService.deleteById(id);
	}

}
