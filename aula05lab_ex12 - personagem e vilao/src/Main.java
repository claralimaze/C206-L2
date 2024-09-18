
public class Main {

    public static void main(String[] args) {

        //Criando instâncias
        Personagem p1 = new Personagem();
        Vilao v1 = new Vilao();
        Vilao v2 = new Vilao();

        //Mostra o número do total de vilões
        System.out.println(Personagem.getnViloes());


        //Setando informaçoes dos objetos
        v1.setNome("Capitao Gancho");
        v1.setVida(1);
        v1.setEnergia(3);

        v2.setNome("Tubarao");
        v2.setVida(333);
        v2.setEnergia(1000);

        p1.setNome("Peter Pan");
        p1.setVida(3);
        p1.setEnergia(5);

        //Usando os métodos
        p1.atacarVilao(v1);
        p1.atacarVilao(v2);


        System.out.println(p1.toString());
        System.out.println(v1.toString());


        //Mostra o numero total de vilões depois que o vilão morreu
        System.out.println(Personagem.getnViloes());
    }
}
