package com.biblioteca.taller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TallerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallerApplication.class, args);
        System.out.println("La aplicación Spring Boot ha iniciado correctamente.");
    }

}
