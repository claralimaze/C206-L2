
public class Aluno {
    private String nome;
    private int matricula;
    private static int nAlunos=0;
    private int credito;
    private int debito;

    public Aluno(){
        nAlunos += 1;
    }

    public static int getnAlunos()
    {
        return nAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getDebito() {
        return debito;
    }

    public void setDebito(int debito) {
        this.debito = debito;
    }

    public boolean renovaMatricula()
    {
        if (confereDebito() > 0)
            return false;

        else
            return true;
    }

    private int confereDebito()
    {
        return debito - credito;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", credito=" + credito +
                ", debito=" + debito +
                '}';
    }
}
