public class Main {
    public static void main(String[] args) {
        Empresa e1 = new Empresa();
        e1.numeroFuncionarios = 400;
        e1.nome = "Inatel";
        e1.valorMercado = 2000000;
        e1.dep1.nome = "Marketing";
        e1.dep1.lucro= 300000;

        e1.aumentaValor();
    }
}
