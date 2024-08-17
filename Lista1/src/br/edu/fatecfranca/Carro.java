package br.edu.fatecfranca;

public class Carro {
    // declaração das variáveis
    public String marca, modelo, cor;
    public int ano;
    public float velAtual;


    // método construtor
    // os parâmetros representam os valores do usuário que serão atribuídos ao objeto
    public Carro(){
        this.marca = ""; this.modelo = "não definido";
    }
    public Carro(String marca, String modelo, String cor, int ano, float velAtual){
        // this representa o objeto que chama o método
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velAtual = velAtual;
    }
    public Carro(String marca, String modelo, String cor, int ano){
        // this representa o objeto que chama o método
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velAtual = 0;
    }
    public void acelerar(float x){
        this.velAtual += x;
    }
    public void frear(float x){
        if (this.velAtual - x >= 0) {
            this.velAtual -= x;
        }
        else {
            System.out.println("Velocidade não pode ser negativa");
        }
    }
    // converte o objeto para um String
    public String toString(){
        return "Marca: " + this.marca + " Modelo: " + this.modelo +
                " Cor " + this.cor + " Ano: " + this.ano + " Vel " + this.velAtual;
    }
}
