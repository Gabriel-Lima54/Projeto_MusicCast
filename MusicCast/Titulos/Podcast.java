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
        System.out.printf("Reproduzindo podcast...%n");
        setTotalReproducoes(getTotalReproducoes() + 1);
    }

    @Override
    public void pausar() {
        System.out.printf("Podcast pausado!%n");
    }

    @Override
    public void parar() {
        System.out.printf("Podcast parado!%n");
    }

    @Override
    public void curtir() {
        System.out.printf("Podcast curtido!%n");
        setTotalCurtidas(getTotalCurtidas() + 1);
    }

    @Override
    public void exibeInfos() {
        System.out.printf("Exibindo informações...%n");
        System.out.printf("%s%n", getTitulo());
        System.out.printf("Duração: %d%n", getDuracao());
        System.out.printf("Programa: %s%n", getPrograma());
        System.out.printf("Apresentador: %s%n", getApresentador());
        System.out.printf("Convidado: %s%n", getConvidado());
        System.out.printf("Tema: %s%n", getTema());
        System.out.printf("%d curtidas%n", getTotalCurtidas());
        System.out.printf("%d Reproduções%n", getTotalReproducoes());
        System.out.printf("Classificação: %.1f%n", getClassificacao());
        if (getTotalClassificacao() > 7){
            System.out.printf("Esse podcast está bombando!%n");
        } else {
            System.out.printf("Não esqueça de deicar uma nota!%n");
        }
        if (getTotalReproducoes() < 100){
            System.out.printf("Podcast lançamento!%n");
        }
    }

    @Override
    public void compartilha() {
        System.out.printf("%s foi compartilhado com os amigos!", getTitulo());
    }

    @Override
    public void favorita() {
        setPodcastFavorito(getTitulo());
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
