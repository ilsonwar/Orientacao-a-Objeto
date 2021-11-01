package net.Unibave.Aula10Abstratismo;


public  class MediaSimples extends CalculaMedia {


    public double calcularMediaAluno(Aluno aluno0) {
        double soma = 0;
        for (Nota nota : aluno0.getNotas()) {
            soma += nota.getNota();
        }
        return soma / aluno0.getNotas().size();
    }


    public double calcularMediaTurma(Turma turma) {
       return 0;
                    //não sei fazer esta média
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





