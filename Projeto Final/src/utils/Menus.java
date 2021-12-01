package utils;

import javax.swing.*;

public class Menus {

    public static ImageIcon logoFlamengo() {
        ImageIcon dab = new ImageIcon("icone_flamengo.png");
        dab.setImage(dab.getImage().getScaledInstance(40, 40, 100));
        return dab;
    }


    public static int menuInicial() {
        StringBuilder menuInicial = new StringBuilder();
        menuInicial.append("1 - Novo Jogo\n");
        menuInicial.append("2 - Sair");

        return Integer.parseInt((String) JOptionPane.showInputDialog(null, menuInicial.toString(), "CLUBE DE REGATAS FLAMENGO",
                JOptionPane.INFORMATION_MESSAGE, logoFlamengo(), null, ""));
    }

    public static int menuPartida() {

        StringBuilder menuPartida = new StringBuilder();

        menuPartida.append("1 - Iniciar Partida\n");
        menuPartida.append("2 - Registrar Evento\n");
        menuPartida.append("3 - Imprimir estatísticas\n");
        menuPartida.append("4 - Sair\n");

        return Integer.parseInt((String) JOptionPane.showInputDialog(null, menuPartida.toString(), "CLUBE DE REGATAS FLAMENGO",
                JOptionPane.INFORMATION_MESSAGE, logoFlamengo(), null, ""));
    }


    public static int menuEvento() {
        StringBuilder menuEvento = new StringBuilder();
        menuEvento.append("1 - Defesa\n");
        menuEvento.append("2 - Gol\n");
        menuEvento.append("3 - Roubada de Bola\n");
        menuEvento.append("4 - Assistência\n");
        menuEvento.append("5 - Finalização\n");
        menuEvento.append("6 - Falta\n");


        return Integer.parseInt((String) JOptionPane.showInputDialog(null, menuEvento.toString(), "CLUBE DE REGATAS FLAMENGO",
                JOptionPane.INFORMATION_MESSAGE, logoFlamengo(), null, ""));
    }

    public static int menuFalta() {
        StringBuilder menuFalta = new StringBuilder();
        menuFalta.append("Clube de Regatas Flamengo\n\n");
        menuFalta.append("1 - Sem cartão\n");
        menuFalta.append("2 - Cartão Amarelo\n");
        menuFalta.append("3 - Cartão Vermelho\n");

        return Integer.parseInt((String) JOptionPane.showInputDialog(null, menuFalta.toString(), "Falta, chama o VAR!",
                JOptionPane.INFORMATION_MESSAGE, logoFlamengo(), null, ""));
    }
}