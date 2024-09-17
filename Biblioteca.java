import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String bairro;
    private ArrayList<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String bairro) {
        this.nome = nome;
        this.bairro = bairro;
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public boolean emprestarLivro(Bibliotecario b, Cliente c, Livro l) {
        if (b.isDisponivel() && c.pagarDebito(0) == 0 && confereLivro(l)) {
            removerLivro(l);
            return true;
        }
        return false;
    }

    public boolean confereLivro(Livro livro) {
        return livros.contains(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return "Biblioteca [Nome: " + nome + ", Bairro: " + bairro + "]";
    }
}