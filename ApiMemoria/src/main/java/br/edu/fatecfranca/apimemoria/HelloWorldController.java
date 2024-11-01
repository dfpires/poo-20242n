package br.edu.fatecfranca.apimemoria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
    @GetMapping("/bomdia")
    public String bomdia() {
        return "Bom dia";
    }
    @GetMapping("/boanoite/{nome}")
    public String boanoite(@PathVariable String nome) {
        return "Boa noite, " + nome;
    }
}
