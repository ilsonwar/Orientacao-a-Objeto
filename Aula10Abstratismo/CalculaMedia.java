package net.Unibave.Aula10Abstratismo;

public abstract class CalculaMedia  {

    public abstract double calcularMediaAluno();

    public abstract double calcularMediaTurma();

    public void mostrarMedia(){
        System.out.println(calcularMediaAluno());
        System.out.println(calcularMediaTurma());


    }

}
