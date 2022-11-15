package com.bosonit.training.examenJPA.chuchi.repository;

import com.bosonit.training.examenJPA.chuchi.entity.LineasFra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLineas extends JpaRepository<LineasFra, Integer> {
}
