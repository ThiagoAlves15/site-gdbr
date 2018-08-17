package api.modelo;

import java.util.List;

public class Contato extends Identificador {
    private Long id;
    private String nome;
    private String email;
    private String telefone; 
    private String celular; 
    private String mensagem;
    
    public Contato(){}
    public Contato(String nome, String email, String telefone, String celular, String mensagem){
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setCelular(celular);
        this.setMensagem(mensagem);    
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
}
