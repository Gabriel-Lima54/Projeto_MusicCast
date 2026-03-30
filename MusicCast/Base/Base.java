package MusicCast.Base;

import java.util.Scanner;

public class Base {
    private String titulo;
    private int duracao;
    private int totalReproducoes = 0;
    private int totalCurtidas = 0;
    private double classificacao;
    private double totalClassificacao;
    public Scanner scan = new Scanner(System.in);



    public void classifica() {
        System.out.println("Digite sua nota: ");
        double nota = scan.nextDouble();

        this.totalClassificacao++;
        this.classificacao += nota;

        // Média real
        double media = this.classificacao / this.totalClassificacao;
        setClassificacao(media);
    }

    //Getters e Setters
    public double getTotalClassificacao() {
        return totalClassificacao;
    }

    public void setTotalClassificacao(double totalClassificacao) {
        this.totalClassificacao = totalClassificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setTotalCurtidas(int totalCurtidas) {
        this.totalCurtidas = totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }
}
