package RotaSmart.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RotaSmart.Api.Models.Motorista;
import RotaSmart.Api.repository.MotoristaRepository;

@RestController
@RequestMapping("/api/motoristas")
@CrossOrigin(origins = "*")
public class MotoristaController {

    @Autowired
    private MotoristaRepository motoristaRepository;

    @GetMapping
    public List<Motorista> listarTodos() {
        return motoristaRepository.findAll();
    }

    @PostMapping
    public Motorista criar(@RequestBody Motorista motorista) {
        return motoristaRepository.save(motorista);
    }
}
