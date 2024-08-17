package br.edu.fatecfranca.exe1;
public class Aluno {
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;
    public Aluno(){
    }
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String passou(){
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }
    
}