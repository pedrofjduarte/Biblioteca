package model;

public class Livro {

    private int codigo;
    private String descLivro;
    private String isbn;
    private Editora editora;

    public Livro() {
    }

    public Livro(int codigo, String descLivro, String isbn, Editora editora) {
        this.codigo = codigo;
        this.descLivro = descLivro;
        this.isbn = isbn;
        this.editora = editora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescLivro() {
        return descLivro;
    }

    public void setDescLivro(String descLivro) {
        this.descLivro = descLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
