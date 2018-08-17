package api.servico;

import api.modelo.Administrador;

public interface ServicoAdministrador {
    public Administrador findById(Long id);
    public Administrador findByLogin(String login);
    public Administrador update(Long id, String whats, String email);
}
