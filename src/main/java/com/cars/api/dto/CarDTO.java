package com.cars.api.dto;


public record CarDTO(String modelo, String fabricante, String dataFabricacao, long valor, short anoModelo) {
  /*
    {
      "modelo": "Fiat Argo 1.3",
      "fabricante": "Fiat",
      "dataFabricacao": "10/02/2006",
      "valor": 10_000_00, //centavos
      "anoModelo": 2023,
    }
  */  
}
