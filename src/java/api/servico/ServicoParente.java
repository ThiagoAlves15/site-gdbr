package api.servico;

import api.modelo.Parente;

public interface ServicoParente {
    public Parente findById(Long id);
    public Parente findByLogin(String login);
    public Parente update(Long id, String whats, String email);
}
