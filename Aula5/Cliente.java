package AulaOrientaçãoObjeto.Aula5;

public class Cliente {
    String nome;
    String CNPJ;
    String endereçoEntrega;
    String dataCadastro;
    int quantidade;
    double valorTotal;
    double pesoTotal;
    boolean statusFaturado;
    boolean statusCancelado;
    long getDiasCadastrada;


    void stats() {

    }

    void faturamento() {
        this.statusFaturado = true;
        System.out.println("Faturando....");
    }

    void Cancelado() {
        this.statusCancelado = true;
    }

    void fabricar() {
        System.out.println("Nota Cadastrada");
    }

    void getDiasCadastrada() {

    }
}