package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

@Data
public class ProdutoDTO {
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
}
