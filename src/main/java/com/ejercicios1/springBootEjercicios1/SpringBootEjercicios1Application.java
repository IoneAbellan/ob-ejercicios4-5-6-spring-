package com.ejercicios1.springBootEjercicios1;

import com.ejercicios1.springBootEjercicios1.controllers.HelloController;
import com.ejercicios1.springBootEjercicios1.entities.Laptop;
import com.ejercicios1.springBootEjercicios1.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootEjercicios1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootEjercicios1Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		//Ejercicio 1
		HelloController helloCont = context.getBean(HelloController.class);
		System.out.println(helloCont.saludo());

		//Ejercicio 2
		Laptop laptop1 = new Laptop(null, "ASUS", 649.8);
		Laptop laptop2 = new Laptop(null, "MSI", 1349.2);
		Laptop laptop3 = new Laptop(null, "Lenovo", 358.0);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);


	}

}
