package RotaSmart.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RotaSmart.Api.Models.Motorista;
import RotaSmart.Api.repository.MotoristaRepository;

@Service
public class MotoristaService {
    @Autowired
    public MotoristaRepository motoristaRepository;

    public Motorista salvar(Motorista motorista){
        return motoristaRepository.save(motorista);
    }

}
