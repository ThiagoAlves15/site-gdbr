package api.modelo;

import java.sql.Timestamp;

public class Postagem extends Identificador { 
    private Long id;
    private String caminho;
    private Timestamp criadoEm;  
    private Long administradorId;
    
    public Postagem() {}
    public Postagem(String caminho, Timestamp criadoEm, Long administradorId){
       this.setCaminho(caminho);
       this.setAdministrador(administradorId);
       this.setCriadoEm(criadoEm);
    }    

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
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
