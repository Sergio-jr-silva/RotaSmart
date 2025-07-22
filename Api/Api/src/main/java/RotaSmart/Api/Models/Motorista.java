package RotaSmart.Api.Models;

import java.awt.Point;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;


import lombok.Data;            
import lombok.NoArgsConstructor; 
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Motorista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String NomeCompleto;
    private String Cpf;
    private String Rg;
    private LocalDate DataNascimento;
    private String Telefone;
    private String email;
    private String endereco;
    private String Numero_Cnh;
    private String categoria_Cnh;
    private LocalDate validade_Cnh;
    private LocalDate Data_Admissao;
    private String Status;

    @Lob
    private String Foto_Documento;
    private Point ultima_Localizacao;
    private LocalDate data_Ultima_Localizacao;
}
