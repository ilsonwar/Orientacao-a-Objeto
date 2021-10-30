package net.Unibave.Aula10Abstratismo;

import java.util.Arrays;

public class Turma {

    private int fase;
    private Aluno[] alunos;

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "fase=" + fase +
                ", alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
