package net.Unibave.Aula9Herança;

public class DocNotaFiscal extends Documento {

     double impostos;

    public DocNotaFiscal(double impostos) {
        this.impostos = impostos;
    }

    public DocNotaFiscal() {

    }

    public double getImpostos() {
        return impostos;
    }

    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public void autorizarImposto(){
        if(impostos>0){
            DocNotaFiscal fiscal = new DocNotaFiscal();
            fiscal.emitir();


        }

    }

}






