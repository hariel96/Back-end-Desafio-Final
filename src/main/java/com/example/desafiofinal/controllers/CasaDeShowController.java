package com.example.desafiofinal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
import com.example.desafiofinal.model.CasaDeShow;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class CasaDeShowController {

	@Autowired
	private CasaDeShowRepo repo;

	@GetMapping("/casadeshow")
	public List<CasaDeShow> getCasasDeShow() {
		return repo.findAll();
	}
	
	@GetMapping("/casadeshow/{id}")
	public Optional<CasaDeShow> getCasasDeShowbyId(@PathVariable(name = "id") Integer id) {
		return repo.findById(id);
	}
	
	@PostMapping("/casadeshow")
	public void criarCasaDeShow(@RequestBody CasaDeShow casaDeShow) {
		repo.save(casaDeShow);
	}
	
	@PutMapping("/casadeshow/{id}")
	public void alteraCasaDeShow(@RequestBody CasaDeShow casaDeShow) {
		repo.save(casaDeShow);
	}
	
	@DeleteMapping("/casadeshow/{id}")
	public List<CasaDeShow> deleteCasaDeShow(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
}
