package core.servico;

import api.dao.ParenteDAO;
import api.modelo.Parente;
import api.servico.ServicoParente;
import core.dao.ParenteDAOMariaDB;

public class ServicoParenteImpl implements ServicoParente {
    
    @Override
    public Parente findById(Long id){
        ParenteDAO pDao = new ParenteDAOMariaDB();
        return pDao.findById(id);
    }
    
    @Override
    public Parente update(Long id, String whats, String email){
        ParenteDAO iDao = new ParenteDAOMariaDB();
        return iDao.update(id, whats, email);
    }

    @Override
    public Parente findByLogin(String nome) {
        ParenteDAO pDao = new ParenteDAOMariaDB();
        Parente p = pDao.findByLogin(nome);
        return p;
    }
}
