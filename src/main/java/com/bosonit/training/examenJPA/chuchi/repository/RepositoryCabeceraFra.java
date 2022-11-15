package com.bosonit.training.examenJPA.chuchi.repository;

import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCabeceraFra extends JpaRepository<CabeceraFra,Integer> {
}
