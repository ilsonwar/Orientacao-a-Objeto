package net.Unibave.Aula10Abstratismo;

public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();
        turma.setFase(4);

        Aluno aluno = new Aluno();
        aluno.setNome("Zé Alcantra");

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro Meneghel");

        Nota nota = new Nota();
        nota.setPeso(10);
        nota.setNota(5.1);
        nota.setNota(8.3);
        nota.setNota(10);
        nota.setNota(7.2);

        Nota nota1 = new Nota();
        nota1.setPeso(10);
        nota1.setNota(10);
        nota1.setNota(5.8);
        nota1.setNota(9);
        nota1.setNota(9.8);

        Nota[] notas = new Nota[3];
        notas[0]= nota;
        notas[1]= nota1;

        Aluno[] alunos = new Aluno[2];
        alunos[0]= aluno;
        alunos[1]= aluno1;


    }
}
