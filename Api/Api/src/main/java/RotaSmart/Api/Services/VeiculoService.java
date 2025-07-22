package RotaSmart.Api.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import RotaSmart.Api.Models.Veiculo;
import RotaSmart.Api.repository.VeiculoRepository;

import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }
}

