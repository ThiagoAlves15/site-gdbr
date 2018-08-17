package api.servico;

import api.modelo.Postagem;
import java.util.ArrayList;

public interface ServicoPostagem {
    public Postagem insert(Postagem postagem);
    public Postagem findById(Long id);
    public ArrayList<Postagem> findByCriadoEm(String criadoEm);
    public ArrayList<Postagem> findAllPostagens();
    public Postagem update(Long id, String caminho, String titulo, String texto);
    public boolean delete(Long id);  
}
