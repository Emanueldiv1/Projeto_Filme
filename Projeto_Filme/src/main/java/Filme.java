import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filme {
    private String id;
    private String titulo;
    private String descricao;
    private Integer anoPublicado;
    private Map<Pais,Classificacao> classificacaoMap = new HashMap<>();
    private Integer duracao;
    private List<Genero> generos = new ArrayList<>();
    private BigDecimal notaAvaliacao;
    private List<Diretor> diretors = new ArrayList<>();
    private List<Autor> autors = new ArrayList<>();
    private List<Ator>  ators = new ArrayList<>();
    private List<Personagem> personagems = new ArrayList<>();
    private List<Comentario> comentarios = new ArrayList<>();
    private List<Idiomas> idiomas = new ArrayList<>();
    private DadosFinanceiros dadosFinanceiros;
    private DadosTecnicos dadosTecnicos;
    private Pessoa pessoa;


    public Filme(String id, String titulo, String descricao, Integer anoPublicado, Integer duracao,
                 BigDecimal notaAvaliacao, DadosFinanceiros dadosFinanceiros, DadosTecnicos dadosTecnicos) {
        this.id= id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.anoPublicado = anoPublicado;
        this.duracao = duracao;
        this.notaAvaliacao = notaAvaliacao;
        this.dadosFinanceiros = dadosFinanceiros;
        this.dadosTecnicos = dadosTecnicos;
    }

    public void adicionarClassificacao(Classificacao classificacao){
        this.classificacaoMap.put(classificacao.getPais(),classificacao);
    }

    public void adicionarGenero(Genero genero){
        this.generos.add(genero);
    }
    public void adicionarDiretor(Diretor diretor){
        this.diretors.add(diretor);
    }
    public void adicionarAutor(Autor autor){
        this.autors.add(autor);
    }
    public void adicionarAtores(Ator ator){
        this.ators.add(ator);
    }

    public void adicionarPersonagem(Personagem personagem){
        this.personagems.add(personagem);
    }
    public void adicionarComentario(Comentario comentario){
        this.comentarios.add(comentario);
    }

    public  void adicionarIdioma(Idiomas idiomas){
        this.idiomas.add(idiomas);
    }

    @Override
    public String toString() {
        return  "\n" + "\n" +"FILME " + "\n" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", anoPublicado=" + anoPublicado + "\n" +
                "classificação=" + classificacaoMap + "\n" +
                "duracao=" + duracao + "\n" +
                "generos=" + generos + "\n" +
                "notaAvaliacao=" + notaAvaliacao + "\n" +
                "diretor=" + diretors + "\n" +
                "autor=" + autors + "\n" +
                "ator=" + ators + "\n" +
                "personagem=" + personagems + "\n" +
                "comentarios=" + comentarios + "\n" +
                "idiomas=" + idiomas + "\n" +
                "dadosFinanceiros=" + dadosFinanceiros + "\n" +
                "dadosTecnicos=" + dadosTecnicos + "\n" +
                '}';
    }
}
