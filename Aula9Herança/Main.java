package net.Unibave.Aula9Herança;

import javax.swing.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setDataCadastro(LocalDateTime.of(2021, 4, 25, 15, 35, 23));

        ClientePessoaFisica fisica = new ClientePessoaFisica();
        fisica.setCpf("123-321-456-00");
        fisica.setNome("Jorge Pereira da Silva");
        fisica.setDataNascimento(LocalDateTime.of(1985, 7, 23, 3, 45, 32));

        ClientePessoaJuridica juridica = new ClientePessoaJuridica();
        juridica.setCnpj("10. 123. 321/0001-56");
        juridica.setDataRegistro(LocalDateTime.of(1993, 8, 12, 14, 8, 32));
        juridica.setFantasia("Mecanica do Zé");
        juridica.setRazaoSocial("Mecanicas zé");

        Endereço endereco = new Endereço();
        endereco.setLogradouro("Bar da esquina");
        endereco.setBairro("Pinheiral");
        endereco.setCidade("Braço do Norte");
        endereco.setEstado("Santa Catarina");

        cliente.setEndereço(endereco);


        DocNotaFiscal fiscal = new DocNotaFiscal();
        fiscal.setTotalImpostos(235);
        fiscal.setDataEmissao(LocalDateTime.now());
        fiscal.setEndereçoEntrega(endereco);
        fiscal.setValorTotal(fiscal.getTotalImpostos()+7000);
        fiscal.setTipoNota("Fiscal");
        fiscal.setCliente(juridica);
        fiscal.setCliente(fisica);


        DocOrcamento orcamento = new DocOrcamento();
        orcamento.setDataValidate(LocalDateTime.of(2021, 12, 30, 15, 23, 32));
        orcamento.setEndereçoEntrega(endereco);
        orcamento.setDataEmissao(LocalDateTime.now());
        orcamento.setValorTotal(5000);
        orcamento.setTipoNota("Orçamento");
        orcamento.setCliente(juridica);
        orcamento.setCliente(fisica);



        int tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de cliente: \n" +
                "1-Física \n" +
                "2-Juridica"));

        if (tipoCliente == 1) {
            int tipoDoc = Integer.parseInt(JOptionPane.showInputDialog("Inforem o tipo do documento: \n" +
                    "1-Orçamento \n" +
                    "2-Nota fiscal"));
            if (tipoDoc == 1) {
                orcamento.emitir();
                orcamento.setCliente(fisica);
            }
            if (tipoDoc == 2) {
                fiscal.emitir();
                fiscal.setCliente(juridica);
            }
        }
        if (tipoCliente == 2) {
            int tipoDoc = Integer.parseInt(JOptionPane.showInputDialog("Inforem o tipo do documento: \n" +
                    "1-Orçamento \n" +
                    "2-Nota fiscal"));

            if (tipoDoc == 1) {
                orcamento.emitir();
                orcamento.setCliente(fisica);
            }
            if (tipoDoc == 2) {
                fiscal.emitir();
                fiscal.setCliente(juridica);
            }

        }

    }
}