package org.example;

public class Empresa {
    String nome;
    float faturamento;
    int funcionariosDisponiveis;
    Funcionario [] funcionarios = new Funcionario[2];
    int aux; //auxiliar para contar todos os funcionarios
    Gerente gerente;

    public void contrataFuncionario(Funcionario funcionario){
        for (int i = 0; i < funcionarios.length; i++) {
            if (funcionarios[i] == null) {
                funcionarios[i] = funcionario;
                break;
            }
        }
        funcionariosDisponiveis++;
    }
    //index é quantos funcionários eu dedsejo promover
    public void promoverFuncionario(int index){
        funcionariosDisponiveis -= index;
        System.out.println("O funcionário foi promovido!");
        aux += index;
    }
    float contarFuncionariosDisponiveis(){
        return funcionariosDisponiveis + aux;
    }

    public void mostraFuncionarios()
    {
        for (Funcionario i : funcionarios)
            if (i != null)
                System.out.println(i.toString());
    }

    public void addGerente(Gerente gerente){
        this.gerente = new Gerente();
    }

    public float venderProjeto() {
        faturamento += 50000;
        return faturamento;
    }



    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome + '\'' +
                ", faturamento=" + faturamento +
                '}';
    }

}
