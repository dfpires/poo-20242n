package br.edu.fatecfranca;

import br.edu.fatecfranca.exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(2000, "Fulano", "1234-5",
                "123456-7");
        obj1.depositar(1000);
        obj1.sacar(1500);
        System.out.println(obj1);

        Cliente obj2 = new Cliente(1000, "Beltrano", "2345-6",
                "34534569");
        obj2.depositar(1000);
        obj2.sacar(2500);
        System.out.println(obj2);
    }
}
