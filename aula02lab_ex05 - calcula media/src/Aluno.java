
import java.util.Scanner;

public class Aluno {
    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    public void calculaMedia()
    {
        int media = (np1 + np2) / 2;
        if (media >= 60) {
            System.out.println("Aluno aprovado!");
            System.out.println("Média: " + media);
        }
        else if (media >= 30) {
            System.out.println("Aluno de np3!");
            System.out.println("Média: " + media);
            calculaNP3(media);
        }

        else {
            System.out.println("Reprovado!");
            System.out.println("Média: " + media);
        }

    }

    public void calculaNP3(int media)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota tirada na NP3: ");
        int np3 = sc.nextInt();
        int novaMedia = (media+np3)/2;
        if (novaMedia >= 50) {
            System.out.println("Aluno aprovado na np3!");
            System.out.println("Média final: " + novaMedia);
        }
        else
        {
            System.out.println("Aluno reprovado!");
            System.out.println("Media final: " + novaMedia);
        }
    }

    public void caracteristicasAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Período: " + periodo);
        System.out.println("Matrícula: " + matricula);


    }

}
