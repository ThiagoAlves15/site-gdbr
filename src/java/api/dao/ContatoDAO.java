package api.dao;

import api.modelo.Contato;
import java.util.ArrayList;

public interface ContatoDAO {
    public Contato insert(Contato contato);
    public Contato findById(Long id);
    public ArrayList<Contato> findByNomeContato(String nome);
    public ArrayList<Contato> findAllContatos();
    public boolean delete(Long id);
}
