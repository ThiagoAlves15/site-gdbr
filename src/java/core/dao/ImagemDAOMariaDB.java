package core.dao;

import api.dao.ImagemDAO;
import api.modelo.Imagem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**    public Imagem insert(Imagem imagem);
    public Imagem findById(Long id);
    public Imagem findByData(String data);
    public List<Imagem> findAll();
    public Imagem update(Imagem imagemAntiga, Imagem imagemNova);
    public boolean delete(Imagem imagem);    */

public class ImagemDAOMariaDB implements ImagemDAO{

    private Connection conexao;
    
    public ImagemDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/portfolio", "thiago", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.print("\nErro de conexão ImagemDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Imagem insert(Imagem imagem) {
        try {
            String query = "insert into imagens (caminho_imagem, criado_em_imagem, parente_id) values(?, ?, ?)";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, imagem.getCaminho());
            comandoSQLp.setTimestamp(2, imagem.getCriadoEm());
            comandoSQLp.setLong(3, imagem.getParente());
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return imagem;
        } catch(Exception e) {
            System.out.println("Erro de conexão... insert imagem");
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Imagem findById(Long id) {
        Imagem i = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.imagens where id_imagem = ?");  
            comandoSQLp.setLong(1, id);
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            i = new Imagem();
            i.setId(rs.getLong(1));
            i.setCaminho(rs.getString(2));
            i.setParente(rs.getLong(3));
            i.setCriadoEm(rs.getTimestamp(4)); 
            //System.out.println(rs.getString(2));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return i;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... ImagemDAOMysql find by id.");
          System.out.println(e);
          e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<Imagem> findByCriadoEm(String criadoEm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList<Imagem> findByIdParente(Long parenteId) {
        ArrayList<Imagem> imagens = new ArrayList<Imagem>();
        
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.imagens where parente_id = ?");  
            comandoSQLp.setLong(1, parenteId);
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                Imagem i = new Imagem();
                i = new Imagem();
                i.setId(rs.getLong(1));
                i.setCaminho(rs.getString(2));
                i.setCriadoEm(rs.getTimestamp(3)); 
                i.setParente(rs.getLong(4));
                
                imagens.add(i);
            }

            comandoSQLp.close();
            rs.close();
            return imagens;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... ImagemDAOMysql find by parente id.");
          System.out.println(e);
          e.printStackTrace();
        }
        return imagens;
    }

    @Override
    public Imagem update(Long id, String caminho) {
        try {
            String query = "update imagens set caminho_imagem = ? where id = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, caminho);
            comandoSQLp.setLong(2, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return null;
        } catch(Exception e) {
            System.out.println("Erro de conexão... update imagem");
            System.out.println(e);
            return null;
        }
    }

    @Override
    public boolean delete(Long id) {
        try {
            String query = "delete from imagens where id_imagem = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setLong(1, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return true;
        } catch(Exception e) {
            System.out.println("Erro de conexão... delete imagem");
            System.out.println(e);
            return false;
        }
    }
}
