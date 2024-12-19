package com.viacep.controller;

import com.viacep.entity.dto.CepResponseDto;
import com.viacep.services.ViaCepService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cep")
public class CepController {
    private final ViaCepService service;

    @GetMapping("/{cep}")
    public ResponseEntity<CepResponseDto> getInfo(@PathVariable String cep) {
        return ResponseEntity.ok().body(service.getInfo(cep));
    }
}
