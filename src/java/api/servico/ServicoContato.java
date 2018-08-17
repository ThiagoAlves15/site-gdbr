package api.servico;

import api.modelo.Contato;
import java.util.ArrayList;

public interface ServicoContato {
    public Contato insert(Contato contato);
    public Contato findById(Long id);
    public ArrayList<Contato> findByNomeContato(Long administradorId, String nome);
    public ArrayList<Contato> findAllContatos();
    public boolean delete(Long id);
}
