package com.example.desafiofinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ingresso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "evento_id", nullable = false)
	private Evento evento;
	
	@Column(nullable = false)
	public String nome;
	
	@Column(nullable = false)
	public Double preco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getId() {
		return id;
	}
	
	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ingresso [id=" + id + "]";
	}
	
	
}
