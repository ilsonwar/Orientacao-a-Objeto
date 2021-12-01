package entities;

import java.time.LocalDate;

public class Atacante extends MeioCampista {

    private int numeroGols;
    private int numeroFinalizacoes;

    public Atacante() {
        super();
    }

    public Atacante(String nome, double salario, int numeroCamisa, LocalDate dataAdmissao) {
        super(nome, salario, numeroCamisa, dataAdmissao);
    }

    @Override
    public String toString() {
        StringBuilder dadosAtacante = new StringBuilder();

        dadosAtacante.append(super.toString());
        dadosAtacante.append("Número de gols: " + getNumeroGols() + "\n");
        dadosAtacante.append("Finalizações: " + getNumeroFinalizacoes() + "\n");

        return dadosAtacante.toString();
    }

    public int getNumeroGols() {
        return numeroGols;
    }

    public void setNumeroGols(int numeroGols) {
        this.numeroGols = numeroGols;
    }

    public int getNumeroFinalizacoes() {
        return numeroFinalizacoes;
    }

    public void setNumeroFinalizacoes(int numeroFinalizacoes) {
        this.numeroFinalizacoes = numeroFinalizacoes;
    }

}
