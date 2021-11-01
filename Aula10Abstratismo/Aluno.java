package net.Unibave.Aula10Abstratismo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private List<Nota> notas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void setNotas(List<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", notas=" + notas +
                '}';
    }
}