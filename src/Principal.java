import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a pedra filosofal");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(152);
        meuFilme.setDiretor("Chris Columbus");
        System.out.println("O filme tem a duração de: " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9.75);
        meuFilme.avalia(8.75);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média de avaliações deste filme é: " + meuFilme.retornaMedia());

        Serie theBigBangTheory = new Serie();
        theBigBangTheory.setNome("The Big Bang Theory");
        theBigBangTheory.setAnoDeLancamento(2007);
        theBigBangTheory.exibeFichaTecnica();
        theBigBangTheory.setTemporadas(10);
        theBigBangTheory.setEpisodiosPorTemporada(10);
        theBigBangTheory.setMinutosPorEpisodio(24);
        System.out.println("Você vai levar " + theBigBangTheory.getDuracaoEmMinutos() + " minutos para maratonar esta série");


        Filme outroFilme = new Filme();
        outroFilme.setNome("Animais Fantásticos e onde Habitam");
        outroFilme.setAnoDeLancamento(2016);
        outroFilme.setDuracaoEmMinutos(132);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(theBigBangTheory);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theBigBangTheory);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
