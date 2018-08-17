package api.dao;

import api.modelo.Postagem;
import java.util.ArrayList;

public interface PostagemDAO {
    public Postagem insert(Postagem postagem);
    public Postagem findById(Long id);
    public ArrayList<Postagem> findByCriadoEm(String criadoEm);
    public ArrayList<Postagem> findAllPostagens();
    public Postagem update(Long id, String caminho);
    public boolean delete(Long id);    
}
