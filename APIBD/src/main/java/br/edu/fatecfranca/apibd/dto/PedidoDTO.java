package br.edu.fatecfranca.apibd.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PedidoDTO {

    private Long idUsuario;
    private String status;
    private LocalDate data;
    private List<ItemPedidoDTO> itens;
}
