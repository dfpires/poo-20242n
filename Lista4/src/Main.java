import br.edu.fatecfranca.exe0.Assistente;
import br.edu.fatecfranca.exe0.Diretor;
import br.edu.fatecfranca.exe0.Funcionario;
import br.edu.fatecfranca.exe0.Gerente;

import java.util.ArrayList;

public class Main {

    public static void calculaFolhaSalarial(ArrayList<Funcionario> funcionarios) {
        float soma = 0;
        for (Funcionario funcionario : funcionarios) {
            soma += funcionario.calculaSalario(); // polimorfismo
        }
        System.out.println("A soma dos salário é " + soma);
    }

    public static void mostra(Funcionario func){
        System.out.println(func.toString()); // polimorfismo
    }
    public static void main(String[] args) {
       Assistente assistente1 = new Assistente("Matheus", "Franca",
               "123.456.789-3", 3000, 4);
        mostra(assistente1);

       Gerente gerente1 = new Gerente("Pedro", "Ribeirão",
               "456.321", 5000, 2000);
        mostra(gerente1);

       Diretor diretor1 = new Diretor("Paulo", "Batatais",
               "980.345", 8000, 1000);
        mostra(diretor1);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(assistente1);
        lista.add(gerente1);
        lista.add(diretor1);

        Funcionario func;



    }
}