package net.Unibave.Aula9Herança;

import java.time.LocalDateTime;

public class ClientePessoaJuridica extends Cliente{

    private String razaoSocial= "BolinhaData";
    private String fantasia= "Bola";
    private String cnpj= "14.214.014/0001-14";
    private LocalDateTime dataRegistro;


    public ClientePessoaJuridica(String logradouro, String bairro, String cidade, String estado, String endereco, LocalDateTime dataCadastro, String razaoSocial, String fantasia, String cnpj, LocalDateTime dataRegistro) {
        super(logradouro, bairro, cidade, estado, endereco, dataCadastro);
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String toString() {
        return "ClientePessoaJuridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", fantasia='" + fantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataRegistro=" + dataRegistro +
                '}';
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
