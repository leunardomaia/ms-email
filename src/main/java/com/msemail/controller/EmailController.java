package com.msemail.controller;

import com.msemail.model.Email;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @GetMapping
    public ResponseEntity<Email> hello() {
        return ResponseEntity.ok(Email.builder().title("Titulo").text("Texto Texto Texto Texto").build());
    }
}