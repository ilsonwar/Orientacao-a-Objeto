package main;

import entities.*;
import utils.Menus;
import utils.Musica;


import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String caminhoMusica = "hino.wav";
		Musica tocaMusica = new Musica();
		tocaMusica.playMusic(caminhoMusica);

		int opcaoMenuEscolhida = 0;

		GerenciadorDePartidaImplementacao gerenciadorDePartida = new GerenciadorDePartidaImplementacao();
		Menus menu = new Menus();

		ArrayList<Atleta> listaDeAtletas = new ArrayList<Atleta>();
		adicionaTodosOsJogadores(listaDeAtletas);
		do {
			opcaoMenuEscolhida = Menus.menuInicial();

			switch (opcaoMenuEscolhida) {

				case 1:
					if(listaDeAtletas.size() < 11 || listaDeAtletas.size() > 11) {
						JOptionPane.showMessageDialog(null, "O TIME PRECISA TER 11 JOGADORES ESCALADOS!");
						break;
					} else {

							String adversario = "";
						do {
							opcaoMenuEscolhida = Menus.menuPartida();
							switch(opcaoMenuEscolhida) {

								case 1:
									String dataSelecionada = JOptionPane.showInputDialog("Informe a data da partida:\nFormato: 11/11/2021");

									String[] dataDaPartida = dataSelecionada.split("/");

									adversario = JOptionPane.showInputDialog("Nome do adversário: ");

									gerenciadorDePartida.iniciarPartida(LocalDate.of(Integer.parseInt(dataDaPartida[2]),
											Integer.parseInt(dataDaPartida[1]),
											Integer.parseInt(dataDaPartida[0])), adversario, listaDeAtletas);
									break;
								case 2:
									if(adversario == ""){
										JOptionPane.showMessageDialog(null, "Partida não foi iniciada!!");
										break;
									}else{

									int opcaoEscolhida = Menus.menuEvento();

										int jogadorEscolhido = Integer.parseInt((String) JOptionPane.showInputDialog(null,"Escolha um jogador:\n"+listarJogadoresPorNome(listaDeAtletas),"CLUBE DE REGATAS FLAMENGO",
												JOptionPane.INFORMATION_MESSAGE,menu.logoFlamengo(),null,""));

									gerenciadorDePartida.registrarEvento(gerenciadorDePartida, listaDeAtletas.get(jogadorEscolhido-1), opcaoEscolhida);
									break;
									}
								case 3:
									if(adversario == ""){
										JOptionPane.showMessageDialog(null, "Partida não foi iniciada!!");
										break;
									}

										gerenciadorDePartida.imprimirEstatisticas(listaDeAtletas);
										break;
										case 4:
											break;
										default:
											JOptionPane.showMessageDialog(null, "Selecione uma opção válida");

							}

						} while(opcaoMenuEscolhida != 4);
							break;
					}
				case 2:
					JOptionPane.showMessageDialog(null, "Você saiu!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Selecione uma opção válida");
					break;
			}

		} while (opcaoMenuEscolhida != 2);
	}

	public static void adicionaTodosOsJogadores(ArrayList<Atleta> listaDeAtletas) {
		Atleta atacante1 = new Atacante("Gabigol",900000,9, LocalDate.of(2020,1,27));
		Atleta atacante2 = new Atacante("Bruno Henrique",880000,27, LocalDate.of(2019,1,22));
		Atleta atacante3 = new Atacante("Vitinho",800000,11, LocalDate.of(2018,7,24));
		Atleta atacante4 = new Atacante("Everton Ribeiro",920000,7, LocalDate.of(2017,6,20));
		Atleta meioCampista1 = new MeioCampista("Andreas Pereira",920000,18, LocalDate.of(2021,8,19));
		Atleta meioCampista2 = new MeioCampista("Arrascaeta",950000,14, LocalDate.of(2019,1,12));
		Atleta meioCampista3 = new MeioCampista("Gustavo Henrique",790000,2, LocalDate.of(2019,12,18));
		Atleta defensor2 = new Defensor("Felipe Luís",830000,16, LocalDate.of(2019,7,23));
		Atleta defensor3 = new Defensor("David Luiz",1100000,23, LocalDate.of(2021,9,10));
		Atleta defensor4 = new Defensor("Matheuzinho",910000,34, LocalDate.of(2019,1,31));
		Atleta goleiro1 = new Goleiro("Diego Alves",1100000,1, LocalDate.of(2017,7,30));

		listaDeAtletas.add(atacante1);
		listaDeAtletas.add(atacante2);
		listaDeAtletas.add(atacante3);
		listaDeAtletas.add(atacante4);
		listaDeAtletas.add(meioCampista1);
		listaDeAtletas.add(meioCampista2);
		listaDeAtletas.add(meioCampista3);
		listaDeAtletas.add(defensor2);
		listaDeAtletas.add(defensor3);
		listaDeAtletas.add(defensor4);
		listaDeAtletas.add(goleiro1);
	}

	public static String listarJogadoresPorNome(ArrayList<Atleta> listaDeAtletas) {
		StringBuilder lista = new StringBuilder();

		for (int i = 0; i < listaDeAtletas.size(); i++) {

			lista.append((i + 1) + " - " + "Nome: " + listaDeAtletas.get(i).getNome() + " - Número da Camisa: "
					+ listaDeAtletas.get(i).getNumeroCamisa() + "\n");

		}

		return lista.toString();
	}

}
