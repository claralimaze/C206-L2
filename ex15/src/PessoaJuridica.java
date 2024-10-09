public class PessoaJuridica extends Pessoa implements Taxas{
    private int lucro;

    public PessoaJuridica(String nome, double rendaBruta){
        super(nome, rendaBruta);
    }

    public int getLucro() {
        return lucro;
    }

    public void setLucro(int lucro) {
        this.lucro = lucro;
    }

    @Override
    public double CalculaImposto() {
        return getRendaBruta() * 0.10;
    }

    @Override
    public double ImpostoFinal() {
        double imposto = CalculaImposto();
        if(lucro > 50000){
            return imposto * 1.2;
        }
        return imposto;
    }
}
