package br.edu.fatecfranca;

public class Carro {
    // declaração das variáveis
    public String marca, modelo, cor;
    public int ano;

    // método construtor
    // os parâmetros representam os valores do usuário que serão atribuídos ao objeto
    public Carro(){
        this.marca = ""; this.modelo = "não definido";
    }
    public Carro(String marca, String modelo, String cor, int ano){
        // this representa o objeto que chama o método
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public void acelerar(){
        System.out.println("objeto marca: " + this.marca + " modelo " + this.modelo +
                " acelerando ");
    }
    public void frear(){
        System.out.println("objeto marca: " + this.marca + " modelo " + this.modelo +
                " freando ");
    }
}
