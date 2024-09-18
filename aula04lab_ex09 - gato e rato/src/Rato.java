
public class Rato {
    String nome;
    boolean escondido;
    int velocidade;

    public void esconder(){
        escondido = true;
        System.out.println("Rato se escondeu!");
    }

    public void procurarComida()
    {
        escondido = false;
        System.out.println("Rato está procurando comida!");
    }

    @Override
    public String toString() {
        return "Rato{" +
                "nome='" + nome + '\'' +
                ", escondido=" + escondido +
                ", velocidade=" + velocidade +
                '}';
    }
}
