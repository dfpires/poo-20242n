package br.edu.fatecfranca.exe2;

public abstract class CartaoWeb {

    protected String destinatario;

    public CartaoWeb() {
    }
    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public abstract void showMessage();
}
