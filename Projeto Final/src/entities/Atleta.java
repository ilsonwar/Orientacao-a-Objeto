package entities;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

public abstract class Atleta {
	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DecimalFormat df = new DecimalFormat("R$ #,##0.00");

	protected String nome;
	protected double salario;
	protected int numeroCamisa;
	protected LocalDate dataAdmissao;
	protected int quantidadeCartoesAmarelos;
	protected int quantidadeCartoesVermelhos;
	protected int quantidadeFaltasCometidas;

	public Atleta() {}

	public Atleta(String nome, double salario, int numeroCamisa, LocalDate dataAdmissao) {
		setNome(nome);
		setSalario(salario);
		setNumeroCamisa(numeroCamisa);
		setDataAdmissao(dataAdmissao);
	}

	@Override
	public String toString() {
		StringBuilder dadosAtleta = new StringBuilder();

		dadosAtleta.append("-----------------------------------------------------------------------\n");
		dadosAtleta.append("Nome: " + getNome() + "\n");
		dadosAtleta.append("Salário: " + df.format(getSalario()) + "\n");
		dadosAtleta.append("Número da camisa: " + getNumeroCamisa() + "\n");
		dadosAtleta.append("Data de admissão: " + getDataAdmissao() + "\n");
		dadosAtleta.append("Quantidade de cartões amarelos: " + getQuantidadeCartoesAmarelos() + " / ");
		dadosAtleta.append("cartões vermelhos: " + getQuantidadeCartoesVermelhos() + " / ");
		dadosAtleta.append("faltas cometidas: " + getQuantidadeFaltasCometidas() + "\n");

		return dadosAtleta.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Atleta atleta = (Atleta) o;
		return numeroCamisa == atleta.numeroCamisa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroCamisa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0) {
			this.salario = 0;
		} else {
			this.salario = salario;
		}
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		Random numeroAleatorio = new Random();

		if (numeroCamisa < 0) {
			this.numeroCamisa = numeroAleatorio.nextInt(999);
		} else {
			this.numeroCamisa = numeroCamisa;
		}
	}

	public String getDataAdmissao() {
		return formato.format(dataAdmissao);
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getQuantidadeCartoesAmarelos() {
		return quantidadeCartoesAmarelos;
	}

	public void setQuantidadeCartoesAmarelos(int quantidadeCartoesAmarelos) {
		this.quantidadeCartoesAmarelos = quantidadeCartoesAmarelos;
	}

	public int getQuantidadeCartoesVermelhos() {
		return quantidadeCartoesVermelhos;
	}

	public void setQuantidadeCartoesVermelhos(int quantidadeCartoesVermelhos) {
		this.quantidadeCartoesVermelhos = quantidadeCartoesVermelhos;
	}

	public int getQuantidadeFaltasCometidas() {
		return quantidadeFaltasCometidas;
	}

	public void setQuantidadeFaltasCometidas(int quantidadeFaltasCometidas) {
		this.quantidadeFaltasCometidas = quantidadeFaltasCometidas;
	}

}

