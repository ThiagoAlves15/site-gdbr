package api.dao;

import api.modelo.Cliente;
import java.util.ArrayList;

public interface ClienteDAO {
    public Cliente insert(Cliente cliente);
    public Cliente findById(Long id);
    public ArrayList<Cliente> findByNomeCliente(Long parenteId, String nome);
    public ArrayList<Cliente> findByIdParente(Long parenteId);
    public boolean delete(Long id);
}
