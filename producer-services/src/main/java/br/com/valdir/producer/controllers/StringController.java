package br.com.valdir.producer.controllers;

import br.com.valdir.producer.service.StringService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("produces")
public class StringController {
    private final StringService stringService;

    @PostMapping
    public ResponseEntity<String> produce(@RequestBody String message){
        stringService.produce(message);
        return ResponseEntity.ok().body(message);
    }
}
