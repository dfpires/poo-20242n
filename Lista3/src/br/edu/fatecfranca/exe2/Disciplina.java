package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String name, sigla;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina() {
    }
    public Disciplina(int id, String name, String sigla, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
        this.alunos = alunos;
    }
    public Disciplina(int id, String name, String sigla, Professor professor) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public Professor getProfessor() {
        return professor;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }
    public void addAluno(Aluno al){
        this.alunos.add(al);
    }
}
