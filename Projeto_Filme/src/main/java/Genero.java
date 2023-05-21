public enum Genero {
    DRAMA("Drama"),
    CRIME("Crime"),
    ACTION("Action"),
    BIOGRAPHY("Biography"),
    HISTORY("History"),
    ADVENTURE("Adventure");

    final String descricao;

    Genero(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
