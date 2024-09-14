package br.edu.fatecfranca.exe2;

public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados() {
        super();
    }
   public DiaDosNamorados(String destinatario) {
        super(destinatario);
   }
    @Override
    public void showMessage() {
        System.out.println("Feliz Dia dos Namorados");
    }
}
