package br.edu.fatecfranca.exe2;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String name, area;
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso() {
    }
    public Curso(int id, String name, String area) {
        this.id = id;
        this.name = name;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }
    public void addDisciplina( int id, String name, String sigla, Professor professor ){
        this.disciplinas.add(new Disciplina(id, name, sigla, professor));
    }
    public void addAlunoDisciplina(int idDisciplina, Aluno aluno){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getId() == idDisciplina){
                disciplina.addAluno(aluno);
                return ;
            }
        }
        System.out.println("Disciplina não existe");
    }
}
