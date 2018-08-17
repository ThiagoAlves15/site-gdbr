package core.servico;

import api.modelo.Contato;
import core.dao.ContatoDAOMariaDB;
import api.servico.ServicoContato;
import java.util.ArrayList;
import api.dao.ContatoDAO;

public class ServicoContatoImpl implements ServicoContato {

    @Override
    public Contato insert(Contato contato) {
        ContatoDAO pDao = new ContatoDAOMariaDB();
        return pDao.insert(contato);
    }
    
    @Override
    public Contato findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Contato> findByNomeContato( String nome) {
        ContatoDAO cDao = new ContatoDAOMariaDB();
        ArrayList<Contato> cList = cDao.findByNomeContato(nome);
        return cList;
    }
    
    @Override
    public ArrayList<Contato> findAllContatos(){
        ContatoDAO cDao = new ContatoDAOMariaDB();
        ArrayList<Contato> cList = cDao.findAllContatos();
        return cList;
    }
    
    @Override
    public boolean delete(Long id) {
        ContatoDAO pDao = new ContatoDAOMariaDB();
        return pDao.delete(id);
    } 
}
