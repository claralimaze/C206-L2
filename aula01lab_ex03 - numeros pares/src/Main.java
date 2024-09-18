import java.util.Scanner;

public class Main {
    public static void numPares(int x)
    {
        for (int i = 0; i <= x; i++)
            if (i%2 == 0)
                System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        numPares(n);
    }
}
