package core.servico;

import api.modelo.Postagem;
import core.dao.PostagemDAOMariaDB;
import api.dao.PostagemDAO;
import api.servico.ServicoPostagem;
import java.util.ArrayList;

public class ServicoPostagemImpl implements ServicoPostagem {
    @Override
    public Postagem insert(Postagem postagem) {
        PostagemDAO pDao = new PostagemDAOMariaDB();
        return pDao.insert(postagem);
    }
    
    @Override
    public Postagem findById(Long id) {
        PostagemDAO pDao = new PostagemDAOMariaDB();
        return pDao.findById(id);
    }
    
    @Override
    public ArrayList<Postagem> findByCriadoEm(String criadoEm) {
        PostagemDAO iDao = new PostagemDAOMariaDB();
        ArrayList<Postagem> iList = iDao.findByCriadoEm(criadoEm);
        return iList;
    }
    
    @Override
    public ArrayList<Postagem> findAllPostagens() {
        PostagemDAO iDao = new PostagemDAOMariaDB();
        ArrayList<Postagem> iList = iDao.findAllPostagens();
        return iList;
    }

    @Override
    public Postagem update(Long id, String caminho, String titulo, String texto) {
        PostagemDAO iDao = new PostagemDAOMariaDB();
        return iDao.update(id, caminho, titulo, texto);
    }
    
    @Override
    public boolean delete(Long id) {
        PostagemDAO iDao = new PostagemDAOMariaDB();
        return iDao.delete(id);
    }
}
