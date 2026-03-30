package MusicCast.Base;

public class calculos extends Base{
    public void classifica() {
        System.out.println("Digite sua nota: ");
        double nota = scan.nextDouble();

        //calcula a nota media
        setClassificacao(getClassificacao() + nota);
        setTotalClassificacao(getTotalClassificacao() + 1);
        double media = getClassificacao() / getTotalClassificacao();
        setClassificacao(media);
    }
}
