import java.util.HashSet;
import java.util.Set;

class Professor extends Usuario {
    private Set<Aluno> alunos = new HashSet<>();
    public Professor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    public void mostrarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.nome + ", Média: " + aluno.calcularMedia());
        }
    }
    @Override
    public void acessarSistema() {
        mostrarAlunos();
    }
    public Set<Aluno> getAlunos() {
        return alunos;
    }
}