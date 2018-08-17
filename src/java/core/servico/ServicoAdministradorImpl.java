package core.servico;

import api.dao.AdministradorDAO;
import api.modelo.Administrador;
import api.servico.ServicoAdministrador;
import core.dao.AdministradorDAOMariaDB;

public class ServicoAdministradorImpl implements ServicoAdministrador {
    
    @Override
    public Administrador findById(Long id){
        AdministradorDAO pDao = new AdministradorDAOMariaDB();
        return pDao.findById(id);
    }
    
    @Override
    public Administrador update(Long id, String login, String senha, String email){
        AdministradorDAO iDao = new AdministradorDAOMariaDB();
        return iDao.update(id, login, senha, email);
    }

    @Override
    public Administrador findByLogin(String nome) {
        AdministradorDAO pDao = new AdministradorDAOMariaDB();
        Administrador p = pDao.findByLogin(nome);
        return p;
    }
}
