import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

abstract class Usuario {
    protected String nome;
    protected int idade;
    protected int matricula;
    public Usuario(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    public abstract void acessarSistema();
}
class NotaInsuficienteException extends Exception {
    public NotaInsuficienteException(String mensagem) {
        super(mensagem);
    }
}