package entities;

import java.time.LocalDate;

public class Goleiro extends Defensor {

    private int numeroDefesas = 0;

    public Goleiro() {
        super();
    }

    public Goleiro(String nome, double salario, int numeroCamisa, LocalDate dataAdmissao) {
        super(nome, salario, numeroCamisa, dataAdmissao);
    }

    @Override
    public String toString() {
        StringBuilder dadosGoleiro = new StringBuilder();

        dadosGoleiro.append(super.toString());
        dadosGoleiro.append("Número de defesas: " + getNumeroDefesas() + "\n");

        return dadosGoleiro.toString();
    }

    public int getNumeroDefesas() {
        return numeroDefesas;
    }

    public void setNumeroDefesas(int numeroDefesas) {
        this.numeroDefesas = numeroDefesas;
    }

}
