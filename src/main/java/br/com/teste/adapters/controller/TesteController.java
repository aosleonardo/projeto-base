package br.com.teste.adapters.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/teste-exemplo")
public class TesteController {

    @GetMapping
    public ResponseEntity<String> testeExemplo() {
        return new ResponseEntity<>("Teste", HttpStatus.OK);
    }

}
