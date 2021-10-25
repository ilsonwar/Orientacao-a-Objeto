package net.Unibave.Aula9Herança;

public class DocNotaFiscal extends Documento {

    private double totalImpostos ;

    public DocNotaFiscal() {
    }

    public DocNotaFiscal(double totalImpostos) {
        this.totalImpostos = totalImpostos;
    }

    public double getTotalImpostos() {
        return totalImpostos;
    }

    public void setTotalImpostos(double totalImpostos) {
        this.totalImpostos = totalImpostos;
    }


    void emitir() {
        if(getTotalImpostos()>0) {
                super.emitir();
        }
    }

}