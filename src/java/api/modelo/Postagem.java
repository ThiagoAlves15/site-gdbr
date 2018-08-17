package api.modelo;

import java.sql.Timestamp;

public class Postagem extends Identificador { 
    private Long id;
    private String caminho;
    private String titulo;
    private String texto;
    private Timestamp criadoEm;  
    private Long administradorId;
    
    public Postagem() {}
    public Postagem(String caminho, String titulo, String texto, Timestamp criadoEm, Long administradorId){
       this.setCaminho(caminho);
       this.setTitulo(titulo);
       this.setTexto(texto);
       this.setAdministrador(administradorId);
       this.setCriadoEm(criadoEm);
    }    

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Long getAdministrador() {
        return administradorId;
    }

    public void setAdministrador(Long administradorId) {
        this.administradorId = administradorId;
    }

    public Timestamp getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(Timestamp criadoEm) {
        this.criadoEm = criadoEm;
    } 
    
}
