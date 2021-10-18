package net.Unibave.Aula9Herança;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DocOrcamento extends Documento {
    private LocalDateTime dataValidade;


    public DocOrcamento() {

    }
    public DocOrcamento(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }


    public LocalDateTime getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDateTime dataValidade) {
        this.dataValidade = dataValidade;
    }

    public void funcaoEmitir(){
        DocOrcamento orcamento= new DocOrcamento();
        LocalDate dataAtual = LocalDate.now();
        orcamento.emitir();
    }

}
