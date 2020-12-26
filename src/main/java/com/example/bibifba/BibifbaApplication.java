package com.example.bibifba;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages= {"com.example.controller", "services"})//Servicos
@EnableJpaRepositories(basePackages = {"dao"})//Repositorio
@EntityScan(basePackages = {"model"})//Entidade
@ComponentScan(basePackageClasses = {services.MeusServicos.class}  )//Servicos


/*@EntityScan(basePackages = {"com.example.demo.model"})//Entidade , done
@EnableJpaRepositories(basePackages = {"DAO"}) done//Repositorio
//@ComponentScan(basePackageClasses = {Services.Servicos.class}  )//Servicos done
@ComponentScan(basePackages = {"Services" ,"com.example.demo" }  )//Servicos done*/ 
@SpringBootApplication
public class BibifbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibifbaApplication.class, args);
	}

}
