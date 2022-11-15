package com.bosonit.training.examenJPA.chuchi.repository;

import com.bosonit.training.examenJPA.chuchi.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespositoryCliente extends JpaRepository<Cliente, Integer> {
}
