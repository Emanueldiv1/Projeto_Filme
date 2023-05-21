import java.time.LocalDateTime;

public class Comentario {
    private String id;
    private String usuario;
    private String conteudo;
    private int like;
    public Comentario(String id, String usuario,String conteudo, int like ){
        this.id = id;
        this.usuario = usuario;
        this.conteudo = conteudo;
        this.like = like;
    }
    public void adicionarLike(){
        this.like++;
    }

    public void removerLike(){
        this.like--;
    }

    @Override
    public String toString() {
        return "Usuario='" + usuario + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", like=" + like;
    }
}


