public class Main {
    public static void main(String[] args){
        PessoaFisica pf = new PessoaFisica("Clara", 3500);
        PessoaJuridica pj = new PessoaJuridica("Inatel", 100000);
        pf.setPosses(8);
        pj.setLucro(600000);


        System.out.println(pf.getNome());
        System.out.println(pf.getRendaBruta());
        System.out.println(pf.CalculaImposto());
        System.out.println(pf.ImpostoFinal());

        System.out.println(pj.getNome());
        System.out.println(pj.getRendaBruta());
        System.out.println(pj.CalculaImposto());
        System.out.println(pj.ImpostoFinal());
    }
}
