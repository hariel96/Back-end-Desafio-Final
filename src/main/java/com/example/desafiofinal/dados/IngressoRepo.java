package com.example.desafiofinal.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafiofinal.model.Ingresso;


public interface IngressoRepo extends JpaRepository<Ingresso, Integer>{

}
