package com.projetoExemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoExemplo.Entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
