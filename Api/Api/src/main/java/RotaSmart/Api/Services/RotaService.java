package RotaSmart.Api.Services;

import RotaSmart.Api.Models.Rotas;
import RotaSmart.Api.repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RotaService {

    @Autowired
    private RotaRepository rotaRepository;

    // Salvar uma nova rota
    public Rotas salvar(Rotas rota) {
        return rotaRepository.save(rota);
    }

    // Listar todas as rotas
    public List<Rotas> listarTodas() {
        return rotaRepository.findAll();
    }

    // Buscar rota por ID (opcional)
    public Rotas buscarPorId(Long id) {
        return rotaRepository.findById(id).orElse(null);
    }

 

    // Deletar uma rota
    public void deletar(Long id) {
        rotaRepository.deleteById(id);
    }
}

