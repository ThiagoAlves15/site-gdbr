package core.dao;

import api.dao.PostagemDAO;
import api.modelo.Postagem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PostagemDAOMariaDB implements PostagemDAO{

    private Connection conexao;
    
    public PostagemDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdbr", "grazi", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.print("\nErro de conexão PostagemDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Postagem insert(Postagem postagem) {
        try {
            String query = "insert into postagens (caminho_imagem_postagem, criado_em_postagem, administrador_id) values(?, ?, ?)";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, postagem.getCaminho());
            comandoSQLp.setTimestamp(2, postagem.getCriadoEm());
            comandoSQLp.setLong(3, postagem.getAdministrador());
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return postagem;
        } catch(Exception e) {
            System.out.println("Erro de conexão... insert postagem");
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Postagem findById(Long id) {
        Postagem i = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from postagens where id_postagem = ?");  
            comandoSQLp.setLong(1, id);
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            i = new Postagem();
            i.setId(rs.getLong(1));
            i.setCaminho(rs.getString(2));
            i.setAdministrador(rs.getLong(3));
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
          System.out.println("\nErro de conexão... PostagemDAOMysql find by id.");
          System.out.println(e);
          e.printStackTrace();
        }
        return i;
    }

    @Override
    public ArrayList<Postagem> findByCriadoEm(String criadoEm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList<Postagem> findAllPostagens() {
        ArrayList<Postagem> postagens = new ArrayList<Postagem>();
        
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from postagens");  
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                Postagem i = new Postagem();
                i = new Postagem();
                i.setId(rs.getLong(1));
                i.setCaminho(rs.getString(2));
                i.setCriadoEm(rs.getTimestamp(3)); 
                i.setAdministrador(rs.getLong(4));
                
                postagens.add(i);
            }

            comandoSQLp.close();
            rs.close();
            return postagens;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... PostagemDAOMysql find all postagens.");
          System.out.println(e);
          e.printStackTrace();
        }
        return postagens;
    }

    @Override
    public Postagem update(Long id, String caminho, String titulo, String texto) {
        try {
            String query = "update postagens set caminho_imagem_postagem = ?, titulo_postagem = ?, texto_postagem = ? where id_postagem = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, caminho);
            comandoSQLp.setString(2, titulo);
            comandoSQLp.setString(3, texto);
            comandoSQLp.setLong(4, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return null;
        } catch(Exception e) {
            System.out.println("Erro de conexão... update postagem");
            System.out.println(e);
            return null;
        }
    }

    @Override
    public boolean delete(Long id) {
        try {
            String query = "delete from postagens where id_postagem = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setLong(1, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return true;
        } catch(Exception e) {
            System.out.println("Erro de conexão... delete postagem");
            System.out.println(e);
            return false;
        }
    }
}
