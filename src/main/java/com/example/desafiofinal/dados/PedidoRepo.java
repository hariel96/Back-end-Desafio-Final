package com.example.desafiofinal.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.desafiofinal.model.Pedido;


public interface PedidoRepo extends JpaRepository<Pedido, Integer>{

}
