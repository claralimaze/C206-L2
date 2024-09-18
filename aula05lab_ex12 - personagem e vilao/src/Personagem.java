
public class Personagem {
    private String nome;

    private int vida;

    private int energia;

    private static int nViloes = 0;

    public static void setnViloes(int nViloes) {
        Personagem.nViloes = nViloes;
    }

    public static int getnViloes() {
        return nViloes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setVida(int vida) {
        this.vida = vida;
    }


    public void setEnergia(int energia) {
        this.energia = energia;
    }


    public void atacarVilao (Vilao vilao)
    {
        if (energia > vilao.getEnergia() && vilao.getVida() >= 0)
        {
            System.out.println("Atacando vilao " + vilao.getNome());
            vilao.setVida(vilao.getVida()-1);
            energia = energia - 1;
            totalDeViloes(vilao);
        }
        else {
            System.out.println("Personagem não conseguiu atacar!");
        }



    }

    private void totalDeViloes (Vilao vilao)
    {
        System.out.println("Nova vida do vilão: " + vilao.getVida());
        if (vilao.getVida() <= 0) {
            System.out.println("Vilão morreu!");
            nViloes = nViloes - 1;
        }

        else
            System.out.println("Vilão ainda está vivo!");

        System.out.println("Total de vilões: " + nViloes);
    }


    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }


}
