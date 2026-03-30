package MusicCast.Titulos;

import MusicCast.Base.Base;
import MusicCast.Base.Interagivel;
import MusicCast.Base.Reproduzivel;

public class Musica extends Base implements Reproduzivel, Interagivel {
    private String album;
    private String cantor;
    private String genero;
    private String musicaFavorita;

    @Override
    public void reproduzir() {
        System.out.printf("Reproduzindo música...%n");
        setTotalReproducoes(getTotalReproducoes() + 1);
    }

    @Override
    public void pausar() {
        System.out.printf("Música pausada!%n");
    }

    @Override
    public void parar() {
        System.out.printf("Música parada!%n");
    }

    @Override
    public void curtir() {
        System.out.printf("Música curtida!%n");
        setTotalCurtidas(getTotalCurtidas() + 1);
    }

    @Override
    public void exibeInfos() {
        System.out.printf("Exibindo informações...%n");
        System.out.printf("%s%n", getTitulo());
        System.out.printf("Duração: %d%n", getDuracao());
        System.out.printf("Albúm: %s%n", getAlbum());
        System.out.printf("Cantor: %s%n", getCantor());
        System.out.printf("Gênero: %s%n", getGenero());
        System.out.printf("%d curtidas%n", getTotalCurtidas());
        System.out.printf("%d Reproduções%n", getTotalReproducoes());
        System.out.printf("Classificação: %.1f%n", getTotalClassificacao());
        if (getTotalClassificacao() > 7){
            System.out.printf("Essa música está bombando!%n");
        } else {
            System.out.printf("Não esqueça de deixar uma nota!%n");
        }
        if (getTotalReproducoes() < 100){
            System.out.printf("Música lançamento!%n");
        }
    }

    @Override
    public void compartilha() {
        System.out.printf("%s foi compartilhada com os amigos!%n", getTitulo());
    }

    @Override
    public void favorita() {
        setMusicaFavorita(getTitulo());
        System.out.printf("%s agora é sua música favorita!%n", getTitulo());
    }

    //Getters e Setters
    public String getMusicaFavorita() {
        return musicaFavorita;
    }

    public void setMusicaFavorita(String musicaFavorita) {
        this.musicaFavorita = musicaFavorita;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
