package com.example.desafiofinal.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafiofinal.model.Evento;


public interface EventoRepo extends JpaRepository<Evento, Integer>{

}
