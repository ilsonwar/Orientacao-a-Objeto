package net.Unibave.Aula9Herança;

import java.time.LocalDateTime;

public class ClientePessoaFisica extends Cliente{

    private String nome= "José Perim";
    private LocalDateTime dataNascimento;
    private String cpf= "1233.2233.3422-34";


    public ClientePessoaFisica(String logradouro, String bairro, String cidade, String estado, String endereco, LocalDateTime dataCadastro, String nome, LocalDateTime dataNascimento, String cpf) {
        super(logradouro, bairro, cidade, estado, endereco, dataCadastro);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClientePessoaFisica{" +
                "nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
