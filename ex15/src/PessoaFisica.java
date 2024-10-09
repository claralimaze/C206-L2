public class PessoaFisica extends Pessoa implements Taxas{
    private int posses;

    public PessoaFisica(String nome, double rendaBruta){
        super(nome, rendaBruta);
    }

    public int getPosses() {
        return posses;
    }

    public void setPosses(int posses) {
        this.posses = posses;
    }

    @Override
    public double CalculaImposto() {
        double renda = getRendaBruta();
        if(renda <= 1400) {
            return 0;
        } else if (renda <= 2100) {
            return (renda * 0.10) - 100;
        } else if (renda <= 2800) {
            return (renda * 0.15) - 270;
        } else if (renda <= 3600) {
            return (renda * 0.25) - 500;
        } else {
            return (renda * 0.30) - 700;
        }
    }

    @Override
    public double ImpostoFinal() {
        double imposto = CalculaImposto();
        if(posses > 5){
            return imposto * 1.1;
        }
        return imposto;
    }
}
