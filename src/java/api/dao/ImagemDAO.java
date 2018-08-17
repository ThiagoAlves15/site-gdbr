package api.dao;

import api.modelo.Imagem;
import java.util.ArrayList;

public interface ImagemDAO {
    public Imagem insert(Imagem imagem);
    public Imagem findById(Long id);
    public ArrayList<Imagem> findByCriadoEm(String criadoEm);
    public ArrayList<Imagem> findByIdParente(Long parenteId);
    public Imagem update(Long id, String caminho);
    public boolean delete(Long id);    
}
