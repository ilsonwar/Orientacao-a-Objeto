package net.Unibave.Aula10Abstratismo;

public class MediaPonderada extends  CalculaMedia{


    public Double calculaMediaAluno(Aluno aluno) {
        double a=0.0,b=0,c=0;
        for(Nota nota : aluno.getNotas()) {
            a += nota.getNota()*nota.getPeso();
            b = a/ nota.getPeso()*aluno.getNotas().size();

        }
        return b;
    }

    @Override
    public double calcularMediaAluno() {
        return 0;
    }

    @Override
    public double calcularMediaTurma() {
        return 0;
    }
}
