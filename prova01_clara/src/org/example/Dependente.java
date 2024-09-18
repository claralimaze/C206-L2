package org.example;
public class Dependente {
    String nome;
    String parentesco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        return "Dependente{" +
                "nome='" + nome + '\'' +
                ", parentesco=" + parentesco +
                '}';
    }
}