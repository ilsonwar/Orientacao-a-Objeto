package net.Unibave.Aula10Abstratismo;

public class Main {
    public static void main(String[] args) {

        Turma turma = new Turma();
        turma.setFase(4);

        Aluno aluno = new Aluno();
        aluno.setNome("Zé Alcantra");
        turma.getAlunos().add(aluno);

        Nota nota = new Nota(7,10);
        aluno.getNotas().add(nota);

        Nota nota1 = new Nota(5.4,10);
        aluno.getNotas().add(nota1);

        Nota nota2 = new Nota(10,10);
        aluno.getNotas().add(nota2);

        MediaSimples mediaSimples = new MediaSimples();
        MediaPonderada mediaPonderada = new MediaPonderada();

        System.out.println("Aluno: "+aluno.getNome()+" ("+turma.getFase()+" Fase) "+"\nNotas: "+nota.getNota()+", "+ nota1.getNota()+", "+ nota2.getNota()+"\nPeso:"+nota.getPeso()+
                "\nMédia Simples: "+mediaSimples.calcularMediaAluno(aluno)+"\nMédia ponderada: "+mediaPonderada.calculaMediaAluno(aluno));


        System.out.println();


        Aluno aluno1 = new Aluno();
        aluno1.setNome("Pedro Meneghel");
        turma.getAlunos().add(aluno1);

        Nota nota3 = new Nota(8.2,10);
        aluno1.getNotas().add(nota3);

        Nota nota4 = new Nota(9,10);
        aluno1.getNotas().add(nota4);

        Nota nota5 = new Nota(6,10);
        aluno1.getNotas().add(nota5);

        System.out.println("Aluno: "+aluno1.getNome()+" ("+turma.getFase()+" Fase) "+"\nNotas: "+nota3.getNota()+", "+ nota4.getNota()+", "+ nota5.getNota()+"\nPeso:"+nota.getPeso()+
                "\nMédia Simples: "+mediaSimples.calcularMediaAluno(aluno1)+"\nMédia ponderada: "+mediaPonderada.calculaMediaAluno(aluno1));


        System.out.println();
        System.out.println("Media da turma "+turma.getFase()+"Fase: "+mediaSimples.calcularMediaTurma(turma));


    }
}
