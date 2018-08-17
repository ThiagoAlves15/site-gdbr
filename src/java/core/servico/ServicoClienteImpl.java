package core.servico;

import api.modelo.Cliente;
import core.dao.ClienteDAOMariaDB;
import api.dao.ClienteDAO;
import api.servico.ServicoCliente;
import java.util.ArrayList;

public class ServicoClienteImpl implements ServicoCliente {

    @Override
    public Cliente insert(Cliente cliente) {
        ClienteDAO pDao = new ClienteDAOMariaDB();
        return pDao.insert(cliente);
    }
    
    @Override
    public Cliente findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> findByNomeCliente(Long parenteId, String nome) {
        ClienteDAO cDao = new ClienteDAOMariaDB();
        ArrayList<Cliente> cList = cDao.findByNomeCliente(parenteId,nome);
        return cList;
    }
    
    @Override
    public ArrayList<Cliente> findByIdParente(Long id){
        ClienteDAO cDao = new ClienteDAOMariaDB();
        ArrayList<Cliente> cList = cDao.findByIdParente(id);
        return cList;
    }
    
    @Override
    public boolean delete(Long id) {
        ClienteDAO pDao = new ClienteDAOMariaDB();
        return pDao.delete(id);
    } 
}
