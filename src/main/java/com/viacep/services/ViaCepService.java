package com.viacep.services;

import com.viacep.entity.dto.CepResponseDto;
import com.viacep.services.client.ViaCepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepService {
    @Autowired
    private ViaCepClient viaCepClient;

    public CepResponseDto getInfo(String cep){
        return viaCepClient.getInfo(cep);
    }
}
