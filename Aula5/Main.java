package AulaOrientaçãoObjeto.Aula5;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();


        cliente.nome = JOptionPane.showInputDialog("Informe seu nome: ");
        cliente.CNPJ = JOptionPane.showInputDialog("Informe seu CNPJ: ");
        cliente.endereçoEntrega= JOptionPane.showInputDialog("Endereço para entrega: ");
        cliente.dataCadastro= JOptionPane.showInputDialog("Digite sua data de cadastramento: ");
        cliente.valorTotal= Double.parseDouble(JOptionPane.showInputDialog("Informe o valor: "));
        cliente.pesoTotal= Double.parseDouble(JOptionPane.showInputDialog("INforme o peso"));
        cliente.statusFaturado = false;
        cliente.statusCancelado = false;
        cliente.faturamento();
        cliente.fabricar();

        JOptionPane.showMessageDialog(null, "Nome: "+cliente.nome);
        JOptionPane.showMessageDialog(null, "CNPJ: "+cliente.CNPJ);
        JOptionPane.showMessageDialog(null, "Endereço: "+cliente.endereçoEntrega);
        JOptionPane.showMessageDialog(null, "Data de cadastro: "+cliente.dataCadastro);
        JOptionPane.showMessageDialog(null, "Valor total: "+cliente.valorTotal);
        JOptionPane.showMessageDialog(null, "Peso total: "+cliente.pesoTotal);
        JOptionPane.showMessageDialog(null, "Faturamento : "+cliente.statusFaturado);
        cliente.Cancelado();

    }
}
