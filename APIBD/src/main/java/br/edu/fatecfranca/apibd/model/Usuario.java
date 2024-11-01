package br.edu.fatecfranca.apibd.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // lombok - gera automaticamente getters, setter e construtores
@Entity // informa que a classe é uma entidade de banco de dados
@Table(name="tb_usuario") // informa que a classe está relacionada a uma tabela chamada tb_usuario
public class Usuario {

    @Id // variável id é uma chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // chave é do tipo serial (inteiro auto-incremento)
    private Long id;
    private String username;
    private String password;
    private String nome;

}
