package br.edu.fatecfranca.apibd.controller;

import br.edu.fatecfranca.apibd.dto.PedidoDTO;
import br.edu.fatecfranca.apibd.model.Pedido;
import br.edu.fatecfranca.apibd.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody PedidoDTO pedidoDTO) {
        try {
            return new ResponseEntity<>(pedidoService.salvar(pedidoDTO), HttpStatus.CREATED);
        }
        catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
