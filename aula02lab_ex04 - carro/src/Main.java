public class Main {
    public static void main(String[] args) {

        //Instanciando a classe carro
        Carro c1 = new Carro();

        //Atribuindo valores aos membros(variáveis)
        c1.modelo = "Golzinho";
        c1.ano = "98";
        c1.velocidadeMaxima = 200;
        c1.rebaixado = true;


        //Chamando os métodos
        c1.acelerando();
        c1.caracteristicas();
        System.out.println("Vai levar multa: " + c1.multa());


        //Trocando o valor de rebaixado pra ver se o método tmb muda
        c1.rebaixado = false;
        System.out.println("Vai levar multa: " + c1.multa());
    }
}
