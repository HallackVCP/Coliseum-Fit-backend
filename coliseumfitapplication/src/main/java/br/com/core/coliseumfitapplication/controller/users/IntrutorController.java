package br.com.core.coliseumfitapplication.controller.users;


import br.com.core.coliseumfitapplication.model.users.Instrutor;
import br.com.core.coliseumfitapplication.services.users.interfaces.InstrutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instrutor")
public class IntrutorController {

    @Autowired
    InstrutorService instrutorService;


    @GetMapping(value = "/findAll")
    public ResponseEntity<List<Instrutor>> findAll(){
        return ResponseEntity.ok().body(instrutorService.findAll());
    }
}
