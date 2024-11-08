package br.edu.fatecfranca.apibd.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String nome;
    private Double preco;

}
