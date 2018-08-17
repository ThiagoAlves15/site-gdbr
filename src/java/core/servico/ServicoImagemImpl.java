package core.servico;

import api.modelo.Imagem;
import core.dao.ImagemDAOMariaDB;
import api.dao.ImagemDAO;
import api.servico.ServicoImagem;
import java.util.ArrayList;

public class ServicoImagemImpl implements ServicoImagem {
    @Override
    public Imagem insert(Imagem imagem) {
        ImagemDAO pDao = new ImagemDAOMariaDB();
        return pDao.insert(imagem);
    }
    
    @Override
    public Imagem findById(Long id) {
        ImagemDAO pDao = new ImagemDAOMariaDB();
        return pDao.findById(id);
    }
    
    @Override
    public ArrayList<Imagem> findByCriadoEm(String criadoEm) {
        ImagemDAO iDao = new ImagemDAOMariaDB();
        ArrayList<Imagem> iList = iDao.findByCriadoEm(criadoEm);
        return iList;
    }
    
    @Override
    public ArrayList<Imagem> findByIdParente(Long parenteId) {
        ImagemDAO iDao = new ImagemDAOMariaDB();
        ArrayList<Imagem> iList = iDao.findByIdParente(parenteId);
        return iList;
    }

    @Override
    public Imagem update(Long id, String caminho) {
        ImagemDAO iDao = new ImagemDAOMariaDB();
        return iDao.update(id, caminho);
    }
    
    @Override
    public boolean delete(Long id) {
        ImagemDAO iDao = new ImagemDAOMariaDB();
        return iDao.delete(id);
    }
}
