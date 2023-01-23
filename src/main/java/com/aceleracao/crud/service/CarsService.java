package com.aceleracao.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aceleracao.crud.DTO.CarsDTO;
import com.aceleracao.crud.model.CarsModel;
import com.aceleracao.crud.repository.CarsRepository;

@Service
public class CarsService {
    
    @Autowired
    private CarsRepository repository;

    public CarsModel post(CarsDTO body){
        return repository.save(new CarsModel(body));
    }

    public List<CarsModel> getAll(){
        return repository.findAll();
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public void update(Long id, CarsDTO body){
        repository.findById(id).map(data -> {
            data.setAnoModelo(body.anoModelo());
            data.setDataFabricacao(body.dataFabricacao());
            data.setFabricante(body.fabricante());
            data.setModelo(body.modelo());
            data.setValor(body.valor());

            return repository.save(data);
        });
    }
}
