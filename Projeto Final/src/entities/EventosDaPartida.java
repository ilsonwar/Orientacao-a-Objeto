package entities;

import javax.swing.*;

public class EventosDaPartida {

    public static void defesa(Goleiro goleiro) {
        JOptionPane.showMessageDialog(null, "Defesa feita pelo " + goleiro.getNome());
        goleiro.setNumeroDefesas(goleiro.getNumeroDefesas() + 1);
    }

    public static void gol(Atacante atacante) {
        JOptionPane.showMessageDialog(null, "GOOOOOOOOOOOOOOOLLLLL!!!!!!!!! DO " + atacante.getNome());
        atacante.setNumeroGols(atacante.getNumeroGols() + 1);
        atacante.setNumeroFinalizacoes(atacante.getNumeroFinalizacoes() + 1);
    }

    public static void roubadaDeBola(Defensor defensor) {
        JOptionPane.showMessageDialog(null, "Roubada de bola do " + defensor.getNome());
        defensor.setNumeroRoubadasDeBola(defensor.getNumeroRoubadasDeBola() + 1);
    }

    public static void assistencia(MeioCampista meioCampista) {
        JOptionPane.showMessageDialog(null, "Assistência de " + meioCampista.getNome());
        meioCampista.setNumeroAssistencias(meioCampista.getNumeroAssistencias() + 1);
    }

    public static void finalizacao(Atacante atacante) {
        JOptionPane.showMessageDialog(null, "Finalização feita pelo " + atacante.getNome());
        atacante.setNumeroFinalizacoes(atacante.getNumeroFinalizacoes() + 1);
    }

    public static void falta(Atleta atleta) {
        JOptionPane.showMessageDialog(null, "Falta feita pelo " + atleta.getNome());
        atleta.setQuantidadeFaltasCometidas(atleta.getQuantidadeFaltasCometidas() + 1);
    }

    public static void cartaoAmarelo(Atleta atleta) {
        JOptionPane.showMessageDialog(null, "Cartão amarelo! Para o jogador " + atleta.getNome());
        atleta.setQuantidadeCartoesAmarelos(atleta.getQuantidadeCartoesAmarelos() + 1);
    }

    public static void cartaoVermelho(Atleta atleta) {
        JOptionPane.showMessageDialog(null, "Cartão vermelho! Para o jogador " + atleta.getNome());
        atleta.setQuantidadeCartoesVermelhos(atleta.getQuantidadeCartoesVermelhos() + 1);
    }

}

