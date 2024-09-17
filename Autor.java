public class Autor {
    private String nome;
    private String pais;

    public Autor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public void escreverLivro(Livro livro) {
        livro.setNomeAutor(this.nome);
    }

    @Override
    public String toString() {
        return "Autor [Nome: " + nome + ", País: " + pais + "]";
    }
}