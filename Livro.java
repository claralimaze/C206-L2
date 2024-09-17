public class Livro {
    private String titulo;
    private int nPaginas;
    private String categoria;
    private String nomeAutor;

    public Livro(String titulo, int nPaginas, String categoria) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
        this.categoria = categoria;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    @Override
    public String toString() {
        return "Livro [Titulo: " + titulo + ", Páginas: " + nPaginas +
                ", Categoria: " + categoria + ", Autor: " + nomeAutor + "]";
    }
}