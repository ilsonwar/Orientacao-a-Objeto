package net.Unibave.Aula9Herança;

import java.time.LocalDateTime;

public class Cliente {

    private Endereço endereço;
    private LocalDateTime dataCadastro;

    public Cliente() {
    }

    public Cliente(Endereço endereço, LocalDateTime dataCadastro) {
        this.endereço = endereço;
        this.dataCadastro = dataCadastro;
    }


    public Endereço getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereço endereço) {
        this.endereço = endereço;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }



}

