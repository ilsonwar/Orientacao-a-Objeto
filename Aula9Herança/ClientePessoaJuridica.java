package net.Unibave.Aula9Herança;

import java.time.LocalDateTime;

public class ClientePessoaJuridica extends Cliente {

    private String razaoSocial;
    private String fantasia;
    private String cnpj;
    private LocalDateTime dataRegistro;

    public ClientePessoaJuridica() {

    }
    public ClientePessoaJuridica(String razaoSocial, String fantasia, String cnpj, LocalDateTime dataRegistro) {
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.dataRegistro = dataRegistro;
    }


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
