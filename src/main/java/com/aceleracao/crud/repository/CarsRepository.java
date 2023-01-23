package com.aceleracao.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracao.crud.model.CarsModel;

public interface CarsRepository extends JpaRepository<CarsModel, Long>{
    
}
