import java.time.LocalDate;

public class Autor extends Pessoa {
        public Autor(String id, String nome, LocalDate dataNascimento)
        {
            super(id,nome,dataNascimento);
        }
        @Override
        public String toString() {
            return String.format(" Nome: " + this.getNome());
        }
}
