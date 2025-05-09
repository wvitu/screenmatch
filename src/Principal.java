public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Harry Potter e a pedra filosofal";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 152;
        meuFilme.diretor = "Chris Columbus";

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(9.5);
        meuFilme.avalia(9.75);
        meuFilme.avalia(8.75);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.retornaMedia());

    }
}
