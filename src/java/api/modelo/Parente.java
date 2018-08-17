package api.modelo;

public class Parente extends Identificador {
    private Long id;
    private String login;
    private String senha;
    private String whats;
    private String email;
    
    public Parente() {}
    public Parente(Long id, String login, String senha, String whats, String email){
        super(id);
        this.setLogin(login);
        this.setSenha(senha);
        this.setWhats(whats);
        this.setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
