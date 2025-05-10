import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter e a pedra filosofal");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(152);
        meuFilme.setDiretor("Chris Columbus");


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9.75);
        meuFilme.avalia(8.75);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A média de avaliações deste filme é: " + meuFilme.retornaMedia());

    }
}
