public class Personagem {
    protected String nome;
    protected Ator ator;

    public Personagem(String nome, Ator ator){
        this.nome = nome;
        this.ator = ator;
    }

    @Override
    public String toString() {
        return " Nome do personagem: " + nome  + ". " + " Nome do Ator que faz esse personagem é: " + this.ator.getNome();
    }
}
