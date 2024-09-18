public class Jogador {
    int energia;
    int vida;

    static int nInimigos = 0;

    Habilidade[] habilidades;


    public Jogador(){}

    public Jogador (int energia, int vida)
    {
        this.energia = energia;
        this.vida = vida;
        this.habilidades = new Habilidade[10];
    }

    public void addHabilidade(Habilidade habilidade)
    {
        for (int i = 0; i < habilidades.length; i++)
        {
            if (habilidades[i] == null) {
                habilidades[i] = habilidade;
                break;
            }
        }
    }

    public void mostraHabilidades()
    {
        for (Habilidade i : habilidades)
            if (i != null)
                System.out.println(i.toString());
    }

    public void atacar(Jogador alvo, Habilidade habilidade)
    {
        if (habilidade.custoDeEnergia <= energia )
        {
            System.out.println("Ataque bem sucedido!");
            energia = energia - habilidade.custoDeEnergia;
            alvo.vida = alvo.vida - habilidade.dano;
            System.out.println("Nova energia: " + energia);
            System.out.println("Nova vida do alvo: " + alvo.vida);
        }
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "energia=" + energia +
                ", vida=" + vida +
                '}';
    }
}
