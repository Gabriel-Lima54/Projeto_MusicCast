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
        System.out.println("Reproduzindo música...");
        setTotalReproducoes(getTotalReproducoes() + 1);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void parar() {
        System.out.println("Música parada!");
    }

    @Override
    public void curtir() {
        System.out.println("Música curtida!");
        setTotalCurtidas(getTotalCurtidas() + 1);
    }

    @Override
    public void exibeInfos() {
        System.out.println("Exibindo informações...%n");
        System.out.printf("%s%n", getTitulo());
        System.out.printf("Duração: %d%n", getDuracao());
        System.out.printf("Albúm: %s", getAlbum());
        System.out.printf("Cantor: %s", getCantor());
        System.out.printf("Gênero: %s", getGenero());
        System.out.printf("%d curtidas%n", getTotalCurtidas());
        System.out.printf("%d Reproduções%n", getTotalReproducoes());
        System.out.printf("Classificação: %.1f ", getTotalClassificacao());
        if (getTotalClassificacao() > 7){
            System.out.println("Essa música está bombando!");
        } else {
            System.out.println("Não esqueça de deicar uma nota!");
        }
        if (getTotalReproducoes() < 100){
            System.out.println("Música lançamento!");
        }
    }

    @Override
    public void compartilha() {
        System.out.printf("%s foi compartilhada com os amigos!", getTitulo());
    }

    @Override
    public void favorita() {
        String favorito = scan.nextLine();
        setMusicaFavorita(favorito);
        System.out.printf("%s agora é sua música favorita!", getTitulo());
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
