import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double comprimento, largura;

        System.out.println("Entre com o comprimento: ");
        comprimento = entrada.nextDouble();

        System.out.println("Entre com a largura: ");
        largura = entrada.nextDouble();

        double area = comprimento * largura;

        System.out.println("Area= "+(int)area); // usar 'sout' para buscar essa função

        entrada.close();
    }
}