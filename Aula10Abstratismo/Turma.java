package net.Unibave.Aula10Abstratismo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private int fase;
    public List<Aluno> alunos = new ArrayList<>();

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

}
