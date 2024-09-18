
public class Main {
    public static void main(String[] args) {
        Carro[] carros = new Carro[4];

        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        Carro c4 = new Carro();

        c1.velocidadeMaxima = 200;
        c1.ano = "2002";
        c1.modelo = "Ford ka";
        c1.rebaixado = true;
        carros[0] = c1;

        c2.velocidadeMaxima = 200;
        c2.ano = "2015";
        c2.modelo = "Onix";
        c2.rebaixado = false;
        carros[1] = c2;

        c3.velocidadeMaxima = 220;
        c3.ano = "2020";
        c3.modelo = "Cruze";
        c3.rebaixado = false;
        carros[2] = c3;

        c4.velocidadeMaxima = 120;
        c4.ano = "1980";
        c4.modelo = "Monza";
        c4.rebaixado = true;
        carros[3] = c4;

        for (int i = 0; i < carros.length ; i++) {
            System.out.println("Posição no vetor: " + i);
            System.out.println("Modelo do carro: " + carros[i].modelo);
        }

    }
}
