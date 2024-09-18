
public class Main {
    public static void main(String[] args) {

        Jogador j1 = new Jogador(3,3);
        Jogador j2 = new Jogador(5,5);
        Habilidade h1 = new Habilidade(3,3,"BolaDeFogo");
        Habilidade h2 = new Habilidade(4,20,"Arma");

        j1.addHabilidade(h1);
        j1.addHabilidade(h2);

        j1.mostraHabilidades();
        j1.atacar(j2, h1);


        System.out.println(j1.toString());
        System.out.println(j2.toString());


    }
}
