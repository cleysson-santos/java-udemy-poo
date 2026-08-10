package Vetores.Exercicios.Entities;

public class Alunos {
    private String name;
    private double notice1;
    private double notice2;

    public Alunos(String name, double notice, double notice2) {
        this.name = name;
        this.notice1 = notice;
        this.notice2 = notice2;
    }

    public double calculateMedia() {
        return (notice1 + notice2) / 2.0;
    }

    public boolean isAprovate() {
        return calculateMedia() >= 6.0;
    }

    public String getName() {
        return name;
    }

}
