package br.edu.fatecfranca.exe1;

public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nroConta = "não definido";
        this.nroAgencia = "não definido";
        this.nome = "não definido";
        this.saldo = 0;
    }

    public Cliente(float saldo, String nome, String nroAgencia, String nroConta) {
        this.setSaldo(saldo);
        this.setNome(nome);
        this.setNroAgencia(nroAgencia);
        this.setNroConta(nroConta);
    }
    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }
    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }
    public void setNroConta(String nroConta) {
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else {
                this.nroConta = "";
                System.out.println("Traço incorreto");
            }
        }
        else {
            this.nroConta = "";
            System.out.println("Tamanho diferente de 8");
        }
    }
    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6){
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else System.out.println("Traço incorreto");
        }
        else System.out.println("Tamanho diferente de 8");
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            this.nome = "";
            System.out.println("Tamanho maior que 30 não é possível");
        }
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saque não permitido");
    }

    public String getNroConta() {
        return nroConta;
    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nroConta='" + nroConta + '\'' +
                ", nroAgencia='" + nroAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
