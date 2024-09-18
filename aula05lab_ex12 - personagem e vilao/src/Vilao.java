
public class Vilao {
    private String nome;

    private int vida;

    private int energia;

    public Vilao()
    {
        Personagem.setnViloes(Personagem.getnViloes() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }



}
