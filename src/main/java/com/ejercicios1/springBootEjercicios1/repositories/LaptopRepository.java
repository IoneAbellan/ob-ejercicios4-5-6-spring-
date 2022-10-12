package com.ejercicios1.springBootEjercicios1.repositories;

import com.ejercicios1.springBootEjercicios1.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
