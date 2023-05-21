public enum Idiomas {
    INGLES("InglÊS"),
    PORTUGUES("Portugues"),
    ESPANHOL("Espanhol");

    final String idioma;

    Idiomas(String idioma){
        this.idioma = idioma;
    }
    public String getIdioma(){
        return idioma;
    }
}
