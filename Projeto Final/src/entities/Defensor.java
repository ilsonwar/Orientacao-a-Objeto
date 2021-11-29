package entities;

import java.time.LocalDate;

public class Defensor extends Atleta {

	protected int numeroPartidasSemSofrerGols = 0;
	protected int numeroRoubadasDeBola = 0;

	public Defensor() {
		super();
	}

	public Defensor(String nome, double salario, int numeroCamisa, LocalDate dataAdmissao) {
		super(nome, salario, numeroCamisa, dataAdmissao);
	}

	@Override
	public String toString() {
		StringBuilder dadosDefensor = new StringBuilder();

		dadosDefensor.append(super.toString());
		dadosDefensor.append("Número de partidas sem sofrer gols: " + getNumeroPartidasSemSofrerGols() + "\n");
		dadosDefensor.append("Número de roubadas de bola: " + getNumeroRoubadasDeBola() + "\n");

		return dadosDefensor.toString();
	}

	public int getNumeroPartidasSemSofrerGols() {
		return numeroPartidasSemSofrerGols;
	}

	public void setNumeroPartidasSemSofrerGols(int numeroPartidasSemSofrerGols) {
		this.numeroPartidasSemSofrerGols = numeroPartidasSemSofrerGols;
	}

	public int getNumeroRoubadasDeBola() {
		return numeroRoubadasDeBola;
	}

	public void setNumeroRoubadasDeBola(int numeroRoubadasDeBola) {
		this.numeroRoubadasDeBola = numeroRoubadasDeBola;
	}



}
