import java.time.LocalDateTime;

public class Usuario extends Pessoa {
    private String email;
    private String login;
    private String senha;
    private LocalDateTime dataCadastro;

    public Usuario(String email, String login, String senha, LocalDateTime dataCadastro){
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return String.format("Email: " + "Login; " + "Senha: " + "data de cadastro: ");
    }
}
