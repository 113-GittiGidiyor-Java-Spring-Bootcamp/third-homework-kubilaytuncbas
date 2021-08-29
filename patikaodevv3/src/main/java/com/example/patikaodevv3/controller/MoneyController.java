package com.example.patikaodevv3.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/convertToMoney")
public class MoneyController {

    private final static String MONEY_ENDPOİNT="http://localhost:8080/swagger-ui.html#/convert-controller";

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public ResponseEntity<String> getTryToUsd(){
        ResponseEntity<String> responseEntity=restTemplate.getForEntity(MONEY_ENDPOİNT,String.class);
        return responseEntity;
    }

}
