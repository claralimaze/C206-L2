public class Carro {
    String modelo;
    int velocidadeMaxima;
    String ano;
    boolean rebaixado;

    public void acelerando()
    {
        System.out.println("Carro " + modelo + " está acelerando na velocidade máxima de " + velocidadeMaxima + " km/h");
    }

    public void caracteristicas()
    {
        System.out.println("Caracteristícas do carro: ");
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade Max: " + velocidadeMaxima);
        System.out.println("É rebaixado: " + rebaixado);
    }

    public boolean multa()
    {
        if (rebaixado)
            return true;
        else
            return false;
    }
}
