package com.example.desafiofinal.controllers;

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

import com.example.desafiofinal.dados.IngressoRepo;
import com.example.desafiofinal.model.CasaDeShow;
import com.example.desafiofinal.model.Ingresso;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class IngressoController {

	@Autowired
	private IngressoRepo repo;

	@GetMapping("/ingresso")
	public List<Ingresso> getIngressos() {
		return repo.findAll();
	}
	
	@GetMapping("/ingresso/{id}")
	public Optional<Ingresso> getIngresobyId(@PathVariable(name = "id") Integer id) {
		return repo.findById(id);
	}

	@PostMapping("/ingresso")
	public void criarIngresso(@RequestBody Ingresso ingresso) {
		repo.save(ingresso);
	}
	
	@PutMapping("/ingresso/{id}")
	public void alteraIngresso(@RequestBody Ingresso ingresso) {
		repo.save(ingresso);
	}
	
	@DeleteMapping("/ingresso/{id}")
	public List<Ingresso> deleteIngresso(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
	
	

}
