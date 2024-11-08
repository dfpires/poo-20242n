package br.edu.fatecfranca.apibd.controller;

import br.edu.fatecfranca.apibd.dto.ProdutoDTO;
import br.edu.fatecfranca.apibd.model.Produto;
import br.edu.fatecfranca.apibd.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // lista todos os produtos
    @GetMapping
    public ResponseEntity<List<Produto>> listaTodos(){
        return new ResponseEntity<>(produtoService.listaTodos(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscaPorId(@PathVariable Long id){
        Optional<Produto> prod = produtoService.buscaPorId(id);
        if (prod.isPresent()){
                return new ResponseEntity<>(prod.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<Produto> salva(@RequestBody ProdutoDTO produtoDTO){
        Produto prod = produtoService.salva(produtoDTO);
        return new ResponseEntity<>(prod, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleta(@PathVariable Long id){
        try {
            produtoService.remover(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> atualiza(@PathVariable Long id , @RequestBody ProdutoDTO produtoDTO){
        try {
            produtoDTO.setId(id);
            return new ResponseEntity<>(produtoService.atualiza(produtoDTO), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
