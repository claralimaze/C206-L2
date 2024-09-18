package org.example;
public class Funcionario {
    String nome;
    String cargo;
    int energia;
    float salario;
    Dependente dependente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void trabalhar(){
        if(energia>0)
            energia-=10;
        else
            descansar();
    }

    private void descansar(){
        energia+=30;
    }

    public void addDependente(Dependente dependente){
        this.dependente = new Dependente();
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", energia=" + energia +
                ", salario=" + salario +
                '}';
    }
}