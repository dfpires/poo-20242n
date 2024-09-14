package br.edu.fatecfranca;

import br.edu.fatecfranca.exe2.CartaoWeb;
import br.edu.fatecfranca.exe2.DiaDosNamorados;

import java.util.ArrayList;
import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
        List<CartaoWeb> lista = new ArrayList<>();
        lista.add(new DiaDosNamorados("Pedro"));
        lista.add(new DiaDosNamorados("Paula"));

        for(CartaoWeb cartao : lista){
            cartao.showMessage();
        }
    }
}
