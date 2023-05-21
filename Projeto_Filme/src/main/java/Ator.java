import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ator extends Pessoa {
    protected String website;
    protected String instagram;
    public Ator(String id, String nome, LocalDate dataNascimento, String website, String instagram){
        super(id,nome, dataNascimento );
        this.website = website;
        this.instagram = instagram;
    }

    @Override
    public String toString() {
        return String.format(" Nome: "  + this.getNome()  + ". " + " Data de nascimento " + getdateNacimento() + ". " +  " WebSite" + website
                        + ". " + " Instagram: " + instagram );
    }
}
