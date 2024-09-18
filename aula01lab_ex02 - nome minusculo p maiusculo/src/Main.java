import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        do{
            palavra = sc.next();
            System.out.println(palavra.toUpperCase());
        }while(palavra.compareTo("sair") != 0);
        System.out.println("Fim de programa");
    }
}
