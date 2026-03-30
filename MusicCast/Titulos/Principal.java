package MusicCast.Titulos;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Podcast podcast = new Podcast();
        Musica musica = new Musica();

        //Define nomes
        podcast.setTitulo("Dia a dia");
        podcast.setPrograma("Lu Studios");
        podcast.setApresentador("Maria Carolina");
        podcast.setConvidado("Hugo Lins");
        podcast.setTema("Rotina de trabalho");

        //Define numeros aleatorios de teste
        podcast.setDuracao(new Random().nextInt(240));
        podcast.setTotalCurtidas(new Random().nextInt(1000));
        podcast.setTotalReproducoes(new Random().nextInt(1000));
        podcast.setTotalClassificacao(new Random().nextDouble(10));

        //Define nomes
        musica.setTitulo("Sideeffects");
        musica.setAlbum("Moth");
        musica.setCantor("DutyWoke");
        musica.setGenero("Pop");

        //Define numeros aleatorios de teste
        musica.setDuracao(new Random().nextInt(10));
        musica.setTotalCurtidas(new Random().nextInt(1000));
        musica.setTotalReproducoes(new Random().nextInt(1000));
        musica.setTotalClassificacao(new Random().nextDouble(10));

        //Testa métodos música
        musica.curtir();
        musica.exibeInfos();
        musica.compartilha();
        musica.favorita();
        musica.reproduzir();
        musica.pausar();
        musica.parar();
        musica.classifica();

        //Testa métodos podcast
        podcast.curtir();
        podcast.exibeInfos();
        podcast.compartilha();
        podcast.favorita();
        podcast.reproduzir();
        podcast.pausar();
        podcast.parar();
        podcast.classifica();
    }
}
