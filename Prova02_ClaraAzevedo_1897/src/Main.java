public class Main {
    public static void main(String[] args) {

        Personagem p1 = new Personagem("Superman", 90);
        Personagem p2 = new Personagem("Coringa", 85);

        Arma visao = null;
        Arma laser = null;
        Arma fogo = null;
        Arma congelar = null;
        
        p1.addArma(visao);
        p1.addArma(congelar);

        p2.addArma(laser);
        p2.addArma(fogo);


        try {
            p1.mostrarArmas();
            p2.mostrarArmas();
        }catch (ArmaQuebradaException e)
        {
            e.printStackTrace();
        }

        p1.mostrarCaracteristicas();
        p2.mostrarCaracteristicas();

        p1.atacar(1, p2);
        p2.atacar(5, p1);

    }
}
