import java.time.LocalDate;

public class Diretor extends Pessoa {
    public Diretor(String id, String nome, LocalDate dateNascimento){
        super(id,nome, dateNascimento);
    }

    @Override
    public String toString() {
        return String.format(" Nome do Diretor: " + getNome());
    }
}
