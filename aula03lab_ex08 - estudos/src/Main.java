public class Main {
    public static void main(String[] args) {

        Disciplina poo = new Disciplina();

        Professor p1 = new Professor();

        p1.nome = "Chris";
        poo.nome = "Programação O.O Java";
        poo.creditos = 4;

        Aluno a1 = new Aluno();
        a1.inteligencia = 1000;
        a1.matricula = 527;
        a1.nome = "Marcão";

        Aluno a2 = new Aluno();
        a2.nome = "Rafaela";
        a2.matricula = 333;
        a2.inteligencia = 300;

        poo.alunos[0] = a1;
        poo.alunos[1] = a2;
        poo.mostraAlunos();


    }
}
