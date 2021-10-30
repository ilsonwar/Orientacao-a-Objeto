package net.Unibave.Aula10Abstratismo;

import java.util.Arrays;

public class Aluno {

    private String nome;
    private Nota[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }
}
