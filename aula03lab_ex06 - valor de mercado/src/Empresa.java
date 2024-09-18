
public class Empresa {
    String nome;
    double valorMercado;
    int numeroFuncionarios;

    Departamento dep1;

    public Empresa()
    {
        dep1 = new Departamento();
    }

    public void aumentaValor()
    {
        valorMercado += dep1.lucro;
        System.out.println("Novo valor de mercado é: " + valorMercado);
    }
}
