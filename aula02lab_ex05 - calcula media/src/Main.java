public class Main {
    public static void main(String[] args) {

        //Instanciando a classe
        Aluno a1 = new Aluno();

        //Atribuindo valores aos membros
        a1.nome = "Jose";
        a1.periodo = 4;
        a1.matricula = 3;
        a1.np1 = 100;
        a1.np2 = 10;

        //Chamando os métodos da classe
        a1.caracteristicasAluno();

        a1.calculaMedia();



    }
}
