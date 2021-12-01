package entities;

import java.time.LocalDate;

public class MeioCampista extends Atleta {

    private int numeroAssistencias = 0;
    private int numeroPasses = 0;
    private int passesErrados = 0;

    public MeioCampista() {
        super();
    }

    public MeioCampista(String nome, double salario, int numeroCamisa, LocalDate dataAdmissao) {
        super(nome, salario, numeroCamisa, dataAdmissao);
    }

    @Override
    public String toString() {
        StringBuilder dadosMeioCampista = new StringBuilder();

        dadosMeioCampista.append(super.toString());
        dadosMeioCampista.append("Número de assistências: " + getNumeroAssistencias() + "\n");
        dadosMeioCampista.append("Número de passes: " + getNumeroPasses() + "\n");
        dadosMeioCampista.append("Número de passes errados: " + getPassesErrados() + "\n");

        return dadosMeioCampista.toString();
    }

    public int getNumeroAssistencias() {
        return numeroAssistencias;
    }

    public void setNumeroAssistencias(int numeroAssistencias) {
        this.numeroAssistencias = numeroAssistencias;
    }

    public int getNumeroPasses() {
        return numeroPasses;
    }

    public void setNumeroPasses(int numeroPasses) {
        this.numeroPasses = numeroPasses;
    }

    public int getPassesErrados() {
        return passesErrados;
    }

    public void setPassesErrados(int passesErrados) {
        this.passesErrados = passesErrados;
    }

}
