
public class Habilidade {
    int custoDeEnergia;
    int dano;
    String descricao;

    public Habilidade(int custoDeEnergia, int dano, String descricao) {
        this.custoDeEnergia = custoDeEnergia;
        this.dano = dano;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Habilidade{" +
                "custoDeEnergia=" + custoDeEnergia +
                ", dano=" + dano +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
