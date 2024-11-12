public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno1 = new Aluno("Clara", 21, 1897);
            Aluno aluno2 = new Aluno("Maria", 23, 1234);
            Professor professor = new Professor("Chris", 30, 5678);
            aluno1.fazerProva(7.5);
            aluno1.fazerProva(8.0);
            aluno2.fazerProva(5.0);
            aluno2.fazerProva(4.5);
            professor.adicionarAluno(aluno1);
            professor.adicionarAluno(aluno2);
            aluno1.fazerMatricula();
            aluno2.fazerMatricula();
            professor.acessarSistema();
        } catch (NotaInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}