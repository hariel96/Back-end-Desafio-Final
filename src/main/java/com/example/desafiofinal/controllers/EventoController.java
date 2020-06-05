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

import com.example.desafiofinal.dados.CasaDeShowRepo;
import com.example.desafiofinal.dados.EventoRepo;
import com.example.desafiofinal.model.CasaDeShow;
import com.example.desafiofinal.model.Evento;


@RestController
@CrossOrigin("http://localhost:4200")

@RequestMapping("/api")
public class EventoController {
	
	@Autowired
	private EventoRepo repo;
	
	private CasaDeShowRepo casaRepo;
	
	@GetMapping("/evento")
	public List<Evento> getEventos() {
		return repo.findAll();
	}
	
	@GetMapping("/evento/{id}")
	public Optional<Evento> getEventobyId(@PathVariable(name = "id") Integer id) {
		return repo.findById(id);
	}
	
	@PostMapping("/evento")
	public void insereEvento(@RequestBody Evento evento) {
		System.out.println(evento);
		repo.save(evento);
	}
	
	@PutMapping("/evento/{id}")
	public void alteraEvento(@RequestBody Evento evento) {
		repo.save(evento);
	}
	
	@DeleteMapping("/evento/{id}")
	public List<Evento> deleteEvento(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
}
