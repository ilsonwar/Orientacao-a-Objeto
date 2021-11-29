package entities;

import utils.Menus;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorDePartidaImplementacao extends Partida implements GerenciadorDePartida {

    Partida partida;

    @Override
    public void iniciarPartida(LocalDate data, String adversario, ArrayList<Atleta> atletasEscalados) {
        partida = new Partida();
        partida.setDataPartida(data);
        partida.setNomeAdversario(adversario);
        partida.setAtletasEscalados(atletasEscalados);
    }

    @Override
    public void registrarEvento(Partida partida, Atleta atleta, int escolha) {
        Defensor defensor = new Defensor();
        MeioCampista meioCampista = new MeioCampista();
        Goleiro goleiro = new Goleiro();
        Atacante atacante = new Atacante();

            int eventoEscolhido = escolha;

            switch (eventoEscolhido) {

                case 1:
                    if (atleta.getClass() == goleiro.getClass()) {
                        EventosDaPartida.defesa((Goleiro) atleta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não tem esse evento.");
                    }
                    break;
                case 2:
                    if (atleta.getClass() == atacante.getClass()) {
                        EventosDaPartida.gol((Atacante) atleta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não tem esse evento.");
                    }
                    break;
                case 3:
                    if (atleta.getClass() == defensor.getClass()) {
                        EventosDaPartida.roubadaDeBola((Defensor) atleta);
                    } else if (atleta.getClass() == goleiro.getClass()) {
                        EventosDaPartida.roubadaDeBola((Goleiro) atleta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não tem esse evento.");
                    }
                    break;
                case 4:
                    if (atleta.getClass() == meioCampista.getClass()) {
                        EventosDaPartida.assistencia((MeioCampista) atleta);
                    } else if (atleta.getClass() == atacante.getClass()) {
                        EventosDaPartida.assistencia((Atacante) atleta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não tem esse evento.");
                    }
                    break;
                case 5:
                    if (atleta.getClass() == atacante.getClass()) {
                        EventosDaPartida.finalizacao((Atacante) atleta);
                    } else {
                        JOptionPane.showMessageDialog(null, "Essa posição não tem esse evento.");
                    }
                    break;
                case 6:
                    EventosDaPartida.falta(atleta);
                    eventoEscolhido = Menus.menuFalta();

                    switch (eventoEscolhido) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Sem cartão.");
                            break;
                        case 2:
                            EventosDaPartida.cartaoAmarelo(atleta);
                            break;
                        case 3:
                            EventosDaPartida.cartaoVermelho(atleta);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
                    }
                            break;

                default:
                    JOptionPane.showMessageDialog(null, "Escolha uma opção válida");
            }
        }

    @Override
    public void imprimirEstatisticas(ArrayList<Atleta> atletas) {
        JTextArea listaDeEstatisticas = new JTextArea();

            listaDeEstatisticas.append(partida.toString()+"\n\n");
        for (Atleta atleta : atletas) {
            listaDeEstatisticas.append(atleta.toString());
        }

        JScrollPane scrollBar = new JScrollPane(listaDeEstatisticas, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        JFrame frame = new JFrame("Estatísticas");
        frame.add(scrollBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

