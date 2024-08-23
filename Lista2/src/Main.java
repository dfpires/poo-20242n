import br.edu.fatecfranca.exe0.Compra;

public class Main {
    public static void main(String[] args) {

        Compra obj1 = new Compra(200, 2, "Aprovada");
        System.out.println(obj1);

        Compra obj2 = new Compra();
        obj2.setQtde(-10);
        obj2.setValor(-200);
        obj2.setSituacao("Bugada");
        System.out.println(obj2);

        Compra obj3 = new Compra();
        obj3.setQtde(10);
        obj3.setValor(10);
        obj3.setSituacao("Aprovado");
        System.out.println(obj3);

        System.out.println("Qtde de obj1 " +
                obj1.getQtde());

        Compra obj4 = new Compra(-30, 4, "bugado");
        System.out.println(obj4);
    }
}