public class Gato {
    String nome;
    int idade;
    int velocidade;

    public Gato(String nome, int idade, int velocidade) {
        this.nome = nome;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    public void brincar()
    {
        System.out.println("Gato brincando!");
    }

    public boolean caçar (Rato rato)
    {
        if (rato.escondido == false && velocidade >= rato.velocidade)
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", velocidade=" + velocidade +
                '}';
    }
}
