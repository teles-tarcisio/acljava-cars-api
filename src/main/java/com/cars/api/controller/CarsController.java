package com.cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController

@RequestMapping("/api")

public class CarsController {

  @PostMapping("/cars")
  public void createCar(@RequestBody CarDTO req) {
    System.out.println("\t -- Cadastro de novo carro --");
    System.out.printf("Fabricante: %s, \tModelo: %s %n", req.fabricante(),req.modelo());

    System.out.printf("Fabricacao: %s, \tAno/Modelo: %s %n", req.dataFabricacao(), req.anoModelo());
    System.out.printf("Valor de Fabrica: R$ %.2f %n", (double) req.valor()/100);
  }
  
}
