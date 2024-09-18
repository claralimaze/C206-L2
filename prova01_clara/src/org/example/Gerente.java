package org.example;
public class Gerente {
    String nome;
    float salario;
    boolean carismatico = true;

    public boolean confereCarisma()
    {
        if (carismatico = true)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", carismático=" + carismatico +
                '}';
    }
}