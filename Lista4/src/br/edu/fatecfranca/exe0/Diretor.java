package br.edu.fatecfranca.exe0;
public class Diretor extends Funcionario{
    private float acoesEmpresa;
    public Diretor() {
        super();
        this.acoesEmpresa = 0;
    }
    public Diretor(String nome, String endereco, String cpf, float salario,
                   float acoesEmpresa){
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }
    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }
    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }
    @Override
    public String toString() {
        return super.toString() + " acoesEmpresa=" + acoesEmpresa ;
    }
    @Override
    public float calculaSalario() {
        return this.salario + ((this.acoesEmpresa * 2)/12);
    }
}
