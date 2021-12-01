package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Partida {

    private String nomeAdversario;
    private LocalDate dataPartida;
    private ArrayList<Atleta> atletasEscalados;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Partida() {
    }

    @Override
    public String toString() {
        StringBuilder dadosPartida = new StringBuilder();

        dadosPartida.append("Adversário: " + getNomeAdversario() + "\n");
        dadosPartida.append("Data da partida: " + formato.format(getDataPartida()));

        return dadosPartida.toString();
    }

    public String getNomeAdversario() {
        return nomeAdversario;
    }

    public void setNomeAdversario(String nomeAdversario) {
        this.nomeAdversario = nomeAdversario;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public ArrayList<Atleta> getAtletasEscalados() {
        return atletasEscalados;
    }

    public void setAtletasEscalados(ArrayList<Atleta> atletasEscalados) {
        this.atletasEscalados = atletasEscalados;
    }

}
