package com.example.desafiofinal.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafiofinal.model.Papel;



public interface PapelRepo extends JpaRepository<Papel, Integer> {

}
