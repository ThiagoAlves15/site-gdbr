package api.dao;

import api.modelo.Parente;

public interface ParenteDAO {
    public Parente findById(Long id);
    public Parente findByLogin(String login);
    public Parente update(Long id, String whats, String email);
}
