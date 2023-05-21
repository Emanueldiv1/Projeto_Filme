public class Pais {
    private String id;
    private String descricao;

    public Pais (String id ,String descricao){
        this.id = id;
        this.descricao = descricao;

    }

    @Override
    public String toString() {
    return String.format("%s", descricao);
    }
}
