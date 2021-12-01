package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public interface GerenciadorDePartida {

    void iniciarPartida(LocalDate data, String adversario, ArrayList<Atleta> atletasEscalados);

    void registrarEvento(Partida partida, Atleta atleta, int escolha);

    void imprimirEstatisticas(ArrayList<Atleta> atletas);
}

