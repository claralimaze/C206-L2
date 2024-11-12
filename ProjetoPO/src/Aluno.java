import java.util.ArrayList;

class Aluno extends Usuario {
    private ArrayList<Double> notas = new ArrayList<>();
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }
    public void fazerProva(double nota) {
        notas.add(nota);
    }
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return notas.size() > 0 ? soma / notas.size() : 0;
    }
    public void fazerMatricula() throws NotaInsuficienteException {
        double media = calcularMedia();
        if (media >= 6.0) {
            System.out.println("Aluno aprovado!");
        } else {
            throw new NotaInsuficienteException("Nota insuficiente para matrícula.");
        }
    }
    @Override
    public void acessarSistema() {
        System.out.println("Aluno " + nome + " acessou o sistema.");
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public int getMatricula() {
        return matricula;
    }
}