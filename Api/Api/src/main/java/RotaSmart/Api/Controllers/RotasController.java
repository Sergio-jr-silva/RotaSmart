package RotaSmart.Api.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import RotaSmart.Api.Models.Rotas;
import RotaSmart.Api.Services.RotaService;

@RestController
@RequestMapping("/api/rotas")
public class RotasController {

    @Autowired
    private RotaService rotaService;

    @PostMapping
    public ResponseEntity<Rotas> criarRota(@RequestBody Rotas rota) {
        Rotas nova = rotaService.salvar(rota);
        return new ResponseEntity<>(nova, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rotas>> listarRotas() {
        return ResponseEntity.ok(rotaService.listarTodas());
    }
}