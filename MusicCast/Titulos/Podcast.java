package MusicCast.Titulos;

import MusicCast.Base.Base;
import MusicCast.Base.Interagivel;
import MusicCast.Base.Reproduzivel;

public class Podcast extends Base implements Reproduzivel, Interagivel {
    private String programa;
    private String apresentador;
    private String convidado;
    private String tema;
    private String podcastFavorito;

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo podcast...");
        setTotalReproducoes(getTotalReproducoes() + 1);
    }

    @Override
    public void pausar() {
        System.out.println("Podcast pausado!");
    }

    @Override
    public void parar() {
        System.out.println("Podcast parado!");
    }

    @Override
    public void curtir() {
        System.out.println("Podcast curtido!");
        setTotalCurtidas(getTotalCurtidas() + 1);
    }

    @Override
    public void exibeInfos() {
        System.out.println("Exibindo informações...%n");
        System.out.printf("%s%n", getTitulo());
        System.out.printf("Duração: %d%n", getDuracao());
        System.out.printf("Programa: %s", getPrograma());
        System.out.printf("Apresentador: %s", getApresentador());
        System.out.printf("Convidado: %s", getConvidado());
        System.out.printf("Tema: %s", getTema());
        System.out.printf("%d curtidas%n", getTotalCurtidas());
        System.out.printf("%d Reproduções%n", getTotalReproducoes());
        System.out.printf("Classificação: %.1f ", getClassificacao());
        if (getTotalClassificacao() > 7){
            System.out.println("Esse podcast está bombando!");
        } else {
            System.out.println("Não esqueça de deicar uma nota!");
        }
        if (getTotalReproducoes() < 100){
            System.out.println("Podcast lançamento!");
        }
    }

    @Override
    public void compartilha() {
        System.out.printf("%s foi compartilhado com os amigos!", getTitulo());
    }

    @Override
    public void favorita() {
        String favorito = scan.nextLine();
        setPodcastFavorito(favorito);
        System.out.printf("%s agora é seu podcast favorito!", getTitulo());
    }

    //Getters e Setters
    public String getPodcastFavorito() {
        return podcastFavorito;
    }

    public void setPodcastFavorito(String podcastFavorito) {
        this.podcastFavorito = podcastFavorito;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
