package com.curriculos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curriculos.models.CurriculoModel;


public interface CurriculoRepository extends JpaRepository<CurriculoModel, Long> {
    
}