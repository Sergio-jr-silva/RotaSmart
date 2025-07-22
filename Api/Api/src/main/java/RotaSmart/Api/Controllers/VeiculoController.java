package RotaSmart.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import RotaSmart.Api.Models.Veiculo;
import RotaSmart.Api.Services.VeiculoService;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarTodos();
    }
}
