package com.ejercicios1.springBootEjercicios1.controllers;

import com.ejercicios1.springBootEjercicios1.entities.Laptop;
import com.ejercicios1.springBootEjercicios1.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    //Ejercicio 3
    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

}
