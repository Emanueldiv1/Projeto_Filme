import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("cleitinho@gmail.com", "cleitoFilmes", "123",  LocalDateTime.now());
        Ator ator1 = new Ator("01", "lucas",LocalDate.now(), "Lucas Filmes", "@lukFilmes");
        Autor autor1 = new Autor("03", "paulo", LocalDate.now());
        Pais paises1 = new Pais("02", "Brasil");
        Personagem personagem1 = new Personagem("cleito",ator1);
        Diretor diretor1 = new Diretor("02", "caio", LocalDate.now());
        Classificacao classificacao1 = new Classificacao("16",paises1);
        Comentario comentario1 = new Comentario("02", "leo", "filme top ",14 );

        Filme filme1 = new Filme("05", "Fome de Poder ", "Historia do Mc Donalds", 2017,
                120, new BigDecimal("9.9"), new DadosFinanceiros(new BigDecimal("50000000"),
                new BigDecimal("1000000")), new DadosTecnicos("Dolby Digital ", "1.85:1"));

        filme1.adicionarAtores(ator1);
        filme1.adicionarAutor(autor1);
        filme1.adicionarPersonagem(personagem1);
        filme1.adicionarDiretor(diretor1);
        filme1.adicionarClassificacao(classificacao1);
        filme1.adicionarGenero(Genero.CRIME);
        filme1.adicionarGenero(Genero.ADVENTURE);
        filme1.adicionarIdioma(Idiomas.ESPANHOL);
        filme1.adicionarIdioma(Idiomas.PORTUGUES);
        filme1.adicionarIdioma(Idiomas.INGLES);
        filme1.adicionarComentario(comentario1);

        System.out.println(filme1);
        System.out.println();

        Usuario usuario2 = new Usuario ("user@gmail.com", "user02", "user2304", LocalDateTime.now());
        Ator ator2  = new Ator("04", "Pedro", LocalDate.now(),"Pedro.com", "@pedro_01");
        Autor autor2 = new Autor("06", "Paulo", LocalDate.now());
        Pais paises2 = new Pais("03", "U.S.A");
        Personagem personagem2 = new Personagem("Jhon", ator2);
        Diretor diretor2 = new Diretor("04","Chad Stahelski",LocalDate.now());
        Classificacao classificacao2 = new Classificacao("18", paises2);
        Comentario comentario2 = new Comentario("08", "carlos", "filme muito bom", 5);

        Filme filme2 = new Filme("09", "Baba Yaga", "Antes de recuperar sua liberdade, Wick deve enfrentar um novo inimigo",
                2023, 120, new BigDecimal("8.8"), new DadosFinanceiros(new BigDecimal("143000000"), new BigDecimal("430000000")),
                new DadosTecnicos("Dolby Digital", "1.85:1")
        );

        filme2.adicionarAtores(ator2);
        filme2.adicionarAutor(autor2);
        filme2.adicionarPersonagem(personagem2);
        filme2.adicionarDiretor(diretor2);
        filme2.adicionarClassificacao(classificacao2);
        filme2.adicionarGenero(Genero.ACTION);
        filme2.adicionarGenero(Genero.ADVENTURE);
        filme2.adicionarIdioma(Idiomas.PORTUGUES);
        filme2.adicionarIdioma(Idiomas.INGLES);
        filme2.adicionarComentario(comentario2);


        System.out.println(filme2);


    }
}
