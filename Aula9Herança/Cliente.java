package net.Unibave.Aula9Herança;

import java.time.LocalDateTime;

public class Cliente extends Endereco  {
    private LocalDateTime dataCadastro;

    public Cliente(String logradouro, String bairro, String cidade, String estado, String endereco, LocalDateTime dataCadastro) {
        super();

    }

    public Cliente(String logradouro, String bairro, String cidade, String estado, LocalDateTime dataCadastro) {
        super(logradouro, bairro, cidade, estado);
        this.dataCadastro = dataCadastro;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                ", dataCadastro=" + dataCadastro +
                '}';
    }


    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }


}
