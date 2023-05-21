import java.time.LocalDate;

 public abstract class Pessoa {
    private String id;
    private String nome;
    private LocalDate dateNascimento;

    protected Pessoa(String id, String nome,LocalDate dateNascimento){
        this.id = id;
        this.nome = nome;
        this.dateNascimento = dateNascimento;

    }

    public Pessoa(){

    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getdateNacimento(){
        return dateNascimento;
    }

}
