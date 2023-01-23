package com.aceleracao.crud.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracao.crud.DTO.CarsDTO;
import com.aceleracao.crud.model.CarsModel;
import com.aceleracao.crud.service.CarsService;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    @Autowired
    private CarsService service;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarsModel post(@RequestBody CarsDTO req){
        return service.post(req);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CarsModel> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable Long id, @RequestBody CarsDTO req){
        service.update(id, req);
    }
}
