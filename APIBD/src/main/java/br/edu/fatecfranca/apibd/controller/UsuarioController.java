package br.edu.fatecfranca.apibd.controller;

import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodos(){
        return new ResponseEntity<>(usuarioService.listaTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscaPorId(@PathVariable Long id){
        Optional<Usuario> usuario = usuarioService.buscaPorId(id);
        return
                usuario.isPresent() ?
                        new ResponseEntity<>(usuario.get(), HttpStatus.OK) :
                        new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
