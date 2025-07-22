package RotaSmart.Api.Models;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rotas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String origem;
    private String destino;

    private LocalDate dataSaida;
    private LocalDate dataChegadaPrevista;

    private String status;

    @ManyToOne
    private Motorista motorista;

    @ManyToOne
    private Veiculo veiculo;
}

