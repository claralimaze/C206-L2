public class Bibliotecario {
    private String nome;
    private int idade;
    private boolean disponivel;

    // Construtor para inicializar os atributos
    public Bibliotecario(String nome, int idade, boolean disponivel) {
        this.nome = nome;
        this.idade = idade;
        this.disponivel = disponivel;
    }

    // Getter para o atributo 'disponivel'
    public boolean isDisponivel() {
        return disponivel;
    }

    // Método para listar os livros de uma biblioteca
    public void listarLivros(Biblioteca biblioteca) {
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro);  // Chama o método toString() de Livro
        }
    }

    // Método toString para representar o bibliotecário
    @Override
    public String toString() {
        return "Bibliotecario [Nome: " + nome + ", Idade: " + idade +
                ", Disponível: " + disponivel + "]";
    }
}