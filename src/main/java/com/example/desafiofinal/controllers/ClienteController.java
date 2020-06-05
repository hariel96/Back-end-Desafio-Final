package com.example.desafiofinal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafiofinal.dados.ClienteRepo;
import com.example.desafiofinal.model.CasaDeShow;
import com.example.desafiofinal.model.Cliente;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteRepo repo;
	
	@GetMapping("/cliente")
	public List<Cliente> getClientes() {
		return repo.findAll();
		}
	
	@GetMapping("/cliente/{id}")
	public Optional<Cliente> getClientebyId(@PathVariable(name = "id") Integer id) {
		return repo.findById(id);
	}
	
	@PostMapping("/cliente")
	public void criarCliente(@RequestBody Cliente cliente) {
		repo.save(cliente);
	}
	
	@PutMapping("/cliente/{id}")
	public void alteraCliente(@RequestBody Cliente cliente) {
		repo.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public List<Cliente> deleteCliente(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}

}
