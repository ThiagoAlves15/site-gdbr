package api.modelo;

import java.sql.Timestamp;

public class Imagem extends Identificador { 
    private Long id;
    private String caminho;
    private Timestamp criadoEm;  
    private Long parenteId;
    
    public Imagem() {}
    public Imagem(String caminho, Timestamp criadoEm, Long parenteId){
       this.setCaminho(caminho);
       this.setParente(parenteId);
       this.setCriadoEm(criadoEm);
    }    

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Long getParente() {
        return parenteId;
    }

    public void setParente(Long parenteId) {
        this.parenteId = parenteId;
    }

    public Timestamp getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(Timestamp criadoEm) {
        this.criadoEm = criadoEm;
    } 
    
}
