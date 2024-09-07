package br.edu.fatecfranca;

import br.edu.fatecfranca.exe2.Aluno;
import br.edu.fatecfranca.exe2.Curso;
import br.edu.fatecfranca.exe2.Professor;

public class MainCurso {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(1, "Paulo", "paulo123");
        Aluno al2 = new Aluno(2, "Pedro", "pedro123");
        Aluno al3 = new Aluno(3, "Maria", "maria123");

        Professor prof1 = new Professor(10, "Carlão", "carlao123");
        Curso curso1 = new Curso(100, "ADS", "Exatas");
        curso1.addDisciplina(1000, "Eng Software", "ESO1", prof1);

        curso1.addAlunoDisciplina(1000, al1);
        curso1.addAlunoDisciplina(1000, al2);
        curso1.addAlunoDisciplina(1000, al3);

        System.out.println(curso1.toString());
    }
}
