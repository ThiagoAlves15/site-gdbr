package api.modelo;

public class Administrador extends Identificador {
    private Long id;
    private String login;
    private String senha;
    private String email;
    
    public Administrador() {}
    public Administrador(Long id, String login, String senha, String email){
        super(id);
        this.setLogin(login);
        this.setSenha(senha);
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
