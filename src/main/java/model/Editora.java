package model;

public class Editora {

    private int codEditora;
    private String razaoSocial;
    private String contato;
    private String telefone;

    public Editora() {
    }

    public Editora(int codEditora, String razaoSocial, String contato, String telefone) {
        this.codEditora = codEditora;
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.telefone = telefone;
    }

    public int getCodEditora() {
        return codEditora;
    }

    public void setCodEditora(int codEditora) {
        this.codEditora = codEditora;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
