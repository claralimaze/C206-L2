
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        Aluno a2 = new Aluno();


        a1.setNome("Joao");
        a1.setMatricula(333);
        a1.setCredito(50);
        a1.setDebito(60);
        System.out.println("Aluno " + a1.getNome() + " renovou matricula: " + a1.renovaMatricula());

        a2.setNome("Marcos");
        a2.setMatricula(555);
        a2.setCredito(40);
        a2.setDebito(0);
        System.out.println("Aluno " + a2.getNome() + " renovou matricula: " + a2.renovaMatricula());

        System.out.println(a1.toString());
        System.out.println(a2.toString());

        System.out.println("Nome do aluno: " + a1.getNome() + " Matrícula: " + a1.getMatricula() + " Credito: " + a1.getCredito() + " Debito: " + a1.getDebito());



        System.out.println("TOTAL DE ALUNOS: " + Aluno.getnAlunos());


    }
}
