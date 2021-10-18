package net.Unibave.Aula9Herança;

import javax.swing.*;
import java.time.LocalDateTime;

public class Documento extends Endereco {
    private LocalDateTime dataEmissao;
    private String tipoDocumento= "Nota fiscal";
    private double valorTotal= 5000.00;
    private boolean emetido= true;
    private String nomeCliente= "Zezinho pereira";


    public Documento(String logradouro, String bairro, String cidade, String estado, LocalDateTime dataEmissao, String tipoDocumento, double valorTotal, boolean emetido, String nomeCliente) {
        super(logradouro, bairro, cidade, estado);
        this.dataEmissao = dataEmissao;
        this.tipoDocumento = tipoDocumento;
        this.valorTotal = valorTotal;
        this.emetido = emetido;
        this.nomeCliente = nomeCliente;
    }

    public Documento() {

    }

    @Override
    public String toString() {
        return "Documento{" +
                "dataEmissao=" + dataEmissao +
                ", valorTotal=" + valorTotal +
                ", emetido=" + emetido +
                ", nomeCliente='" + nomeCliente + '\'' +
                '}';
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isEmetido() {
        return emetido;
    }

    public void setEmetido(boolean emetido) {
        this.emetido = emetido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }



    public void emitir(){

        JOptionPane.showMessageDialog(null, "Cliente:  " +getNomeCliente()+"\n" +
                "Tipo de Documento: " +getTipoDocumento()+"\n"+
                "Data de emissão: "+getDataEmissao()+"\n" +
                "Valor total: "+getValorTotal()+"\n" +
                "Emissão: "+isEmetido()+"\n \n" +
                "Endereço de entrega: \n" +
                "Logradouro: "+getLogradouro()+"\n" +
                "Bairro: "+getBairro()+"\n" +
                "Cidade: "+getCidade()+"\n" +
                "Estado: "+getEstado());
    }


}
