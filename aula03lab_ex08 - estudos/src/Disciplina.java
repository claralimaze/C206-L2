public class Disciplina {
    String nome;

    int creditos;

    Aluno[] alunos = new Aluno[2];

    public void mostraAlunos()
    {
        for (int i = 0; i < alunos.length; i++)
            System.out.println("Nome: " + alunos[i].nome + " Mat: " + alunos[i].matricula + " Inteligencia: " + alunos[i].inteligencia);
    }
}
