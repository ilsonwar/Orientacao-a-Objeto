package com.OrientaçãoObjeto;

import javax.swing.*;

public class Aula10l08 {
    public static void main(String[] args) {
        int qAlunos, qNotas;
        double notas = 0, media=0, soma=0;

        qAlunos=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos: "));
        String[] nome = new String[qAlunos];

        for(int i=0; i<qAlunos;i++){
             nome[i] = JOptionPane.showInputDialog("Infome o nome do aluno: ");
            qNotas=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas do aluno: "+nome[i] ));


            notas=0;

            for(int j=0; j<qNotas ; j++){


                notas+=Double.parseDouble(JOptionPane.showInputDialog("Insira a nota: "));

            }

            double medias[]= new double[qAlunos];
            medias[i]= notas/qNotas;
            JOptionPane.showMessageDialog(null, nome[i]+" tem média: "+medias[i]);
        }

    }
    }
//Queria mostrar em lita com todos os nome com todas as respectivas médias,
// mas não consegui, tentei um StringBuilder, mas também não consegui.
