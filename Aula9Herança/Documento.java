package net.Unibave.Aula9Herança;

import javax.swing.*;
import java.time.LocalDateTime;

public class Documento {

    private LocalDateTime dataEmissao;
    private String tipoNota;
    private double valorTotal;
    private boolean emitido;
    private Cliente cliente;
    private Endereço endereçoEntrega;

    public Documento() {
    }

    public Documento(LocalDateTime dataEmissao, String tipoNota, double valorTotal, boolean emitido, Cliente cliente, Endereço endereçoEntrega) {
        this.dataEmissao = dataEmissao;
        this.tipoNota = tipoNota;
        this.valorTotal = valorTotal;
        this.emitido = emitido;
        this.cliente = cliente;
        this.endereçoEntrega = endereçoEntrega;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "dataEmissao=" + dataEmissao +
                ", tipoNota='" + tipoNota + '\'' +
                ", valorTotal=" + valorTotal +
                ", emitido=" + emitido +
                ", cliente=" + cliente +
                ", endereçoEntrega=" + endereçoEntrega +
                '}';
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(String tipoNota) {
        this.tipoNota = tipoNota;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isEmitido() {
        return emitido;
    }

    public void setEmitido(boolean emitido) {
        this.emitido = emitido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Endereço getEndereçoEntrega() {
        return endereçoEntrega;
    }

    public void setEndereçoEntrega(Endereço endereçoEntrega) {
        this.endereçoEntrega = endereçoEntrega;
    }

    void emitir(){
        JOptionPane.showMessageDialog(null,"---------------------\n" +
                                                                  "Data emissão: "+getDataEmissao()+"\n" +
                                                                  "Tipo da nota: "+getTipoNota()+"\n" +
                                                                  "Cliente: "+getCliente() +"\n"+
                                                                  "Endereço de entrega: "+getEndereçoEntrega().getCidade()+"\n" +
                                                                  "Valor total: " +getValorTotal()+"\n"+
                                                                  "---------------------");

        }

}

