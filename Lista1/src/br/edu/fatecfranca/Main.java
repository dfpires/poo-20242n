package br.edu.fatecfranca;
public class Main {
    public static void main(String[] args) {
        // instancia os objetos da classe Carro
        Carro obj1 = new Carro("Toyota", "Corolla", "Cinza", 2018);

        Carro obj2 = new Carro("Chevrolet", "Onix", "Preto", 2013);

        obj1.acelerar();

        obj2.frear();

        Carro obj3 = new Carro();
        obj3.acelerar();
    }
}