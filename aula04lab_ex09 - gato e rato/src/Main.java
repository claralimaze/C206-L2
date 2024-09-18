public class Main {
    public static void main(String[] args) {
        Gato g1 = new Gato("Tom",13,30);
        Rato r1 = new Rato();

        r1.velocidade = 2;
        r1.nome = "Jerry";
        r1.esconder();
        r1.procurarComida();

        g1.brincar();
        System.out.println("Vamos ver se a caça foi um sucesso: ");
        System.out.println(g1.caçar(r1));

        System.out.println(g1.toString());
        System.out.println(r1.toString());


    }
}
