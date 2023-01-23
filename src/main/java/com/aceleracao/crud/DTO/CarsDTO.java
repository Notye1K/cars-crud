package com.aceleracao.crud.DTO;

public record CarsDTO(
    String modelo,
	String fabricante,
	String dataFabricacao,
	Double valor,
	int anoModelo
) {
    
}
