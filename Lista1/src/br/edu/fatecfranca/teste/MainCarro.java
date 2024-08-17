package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.Carro;

import javax.swing.*;

public class MainCarro {
    public static void main(String[] args) {
        // instancia os objetos da classe Carro
        Carro obj1 = new Carro("Toyota", "Corolla", "Cinza", 2018, 0);

        Carro obj2 = new Carro("Chevrolet", "Onix", "Preto", 2013, 0);

        String aux = JOptionPane.showInputDialog("Acelerar de quanto?");
        obj1.acelerar(Float.parseFloat(aux));
        aux = JOptionPane.showInputDialog("Acelerar de quanto?");
        obj1.frear(Float.parseFloat(aux));
        JOptionPane.showMessageDialog(null, obj1.toString());

        obj2.acelerar(80);
        obj2.frear(60);
        System.out.println(obj2.toString());
    }
}