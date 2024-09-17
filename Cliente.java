public class Cliente {
    private String nome;
    private int idade;
    private double debito;

    public Cliente(String nome, int idade, double debito) {
        this.nome = nome;
        this.idade = idade;
        this.debito = debito;
    }

    public double pagarDebito(double quantidade) {
        this.debito -= quantidade;
        if (this.debito < 0) {
            this.debito = 0;
        }
        return this.debito;
    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + nome + ", Idade: " + idade +
                ", Débito: " + debito + "]";
    }
}
