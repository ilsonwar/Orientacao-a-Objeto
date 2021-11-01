package net.Unibave.Aula10Abstratismo;

public class Nota {

    private double nota;
    private double peso;

    public Nota(double nota, double peso) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "";
    }
}