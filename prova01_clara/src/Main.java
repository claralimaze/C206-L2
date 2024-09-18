package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner pedido = new Scanner(System.in);
        System.out.println("Digite a sua escolha: ");
        int escolha = pedido.nextInt();
        float ftotal;

        Empresa empresa = new Empresa();
        empresa.nome = "CLJ";
        empresa.faturamento = 53710000;

        while (escolha != 0) {
            //adicionar funcionario
            if (escolha == 1) {
                System.out.println("Você escolheu a primeira opção!");
                Funcionario funcionario = new Funcionario();
                System.out.println("Digite o nome do funcionário: ");
                funcionario.nome() = pedido.nextInt();
                System.out.println("Digite o cargo do funcionário: ");
                funcionario.setCargo() = pedido.nextInt();
                System.out.println("Digite a energia do funcionário: ");
                funcionario.energia = pedido.nextLine();
                System.out.println("Digite o salario do funcionário: ");
                funcionario.salario = pedido.nextLine();
                System.out.println("Digite o nome do dependente do funcionário: ");
                funcionario.dependente.nome = pedido.nextLine();
                System.out.println("Digite o salario grau de parentesco do dependente do funcionário: ");
                funcionario.dependente.parentesco = pedido.nextLine();
                empresa.contrataFuncionario(funcionario);
            }
            //alocar funcionario
            if (escolha == 2) {
                System.out.println("Você escolheu a segunda opção!");
                empresa.promoverFuncionario(1);
            }
            //contar funcionarios
            if (escolha == 3) {
                System.out.println("Você escolheu a terceira opção!");
                ftotal = empresa.venderProjeto();
                System.out.println("Faturamento total da empresa: " + ftotal);
            }
            //mostrar informações da empresa
            if (escolha == 4) {
                System.out.println("Você escolheu a quarta opção!");
                empresa.toString();
            }
            System.out.println("Digite uma nova escolha: ");
            escolha = pedido.nextInt();
        }
    }
}