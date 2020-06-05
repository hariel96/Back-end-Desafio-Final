package com.example.desafiofinal.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafiofinal.model.Cliente;



public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

}
