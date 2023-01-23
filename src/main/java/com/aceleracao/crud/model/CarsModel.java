package com.aceleracao.crud.model;

import com.aceleracao.crud.DTO.CarsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class CarsModel {

    public CarsModel(CarsDTO data){
        this.anoModelo = data.anoModelo();
        this.dataFabricacao = data.dataFabricacao();
        this.fabricante = data.fabricante();
        this.valor = data.valor();
        this.modelo = data.modelo();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255, nullable = false)
    private String modelo;

    @Column(length = 255, nullable = false)
	private String fabricante;

    @Column(length = 255, nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private Double valor;

    @Column(nullable = false)
    private int anoModelo;
}
