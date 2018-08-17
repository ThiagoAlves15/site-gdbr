package api.dao;

import api.modelo.Administrador;

public interface AdministradorDAO {
    public Administrador findById(Long id);
    public Administrador findByLogin(String login);
    public Administrador update(Long id, String login, String senha, String email);
}
