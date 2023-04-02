package com.msemail.controller;

import com.msemail.dto.EmailDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @GetMapping
    public ResponseEntity<EmailDto> hello() {
        return ResponseEntity.ok(EmailDto.builder()
                .subject("Titulo")
                .text("Texto Texto Texto Texto")
                .to("someone@email.com")
                .build());
    }
}