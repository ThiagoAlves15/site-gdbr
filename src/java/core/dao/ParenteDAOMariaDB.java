package core.dao;

import api.dao.ParenteDAO;
import api.modelo.Parente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParenteDAOMariaDB implements ParenteDAO{

    Connection conexao;
    
    public ParenteDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/portfolio", "thiago", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.println("\nErro de conexão ParenteDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Parente findById(Long id) {
        Parente p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.parentes where id_parente = ?");  
            comandoSQLp.setLong(1, id);
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            p = new Parente();
            p.setId((rs.getLong("id_parente")));
            p.setLogin(rs.getString("login_parente"));
            p.setSenha(rs.getString("senha_parente"));
            p.setWhats(rs.getString("whats_parente"));
            p.setEmail(rs.getString("email_parente"));

            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return p;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... ParenteDAOmariadb find by id.");
          e.printStackTrace();
        }
        return p;
    }

    @Override
    public Parente findByLogin(String login){
        Parente p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.parentes where login_parente = ?");  
            comandoSQLp.setString(1, login);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado...");
            rs.next();
            p = new Parente();
            p.setId((rs.getLong("id_parente")));
            p.setLogin(rs.getString("login_parente"));
            p.setSenha(rs.getString("senha_parente"));
            p.setWhats(rs.getString("whats_parente"));
            p.setEmail(rs.getString("email_parente"));
            comandoSQLp.close();
            rs.close();
            conexao.close();
            return p;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão...Find by nome cliente.");
          e.printStackTrace();
        }
        return p;
    }
    
    @Override
    public Parente update(Long id, String whats, String email) {
        try {
            String query = "update parentes set whats_parente = ?, email_parente = ? where id_parente = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, whats);
            comandoSQLp.setString(2, email);
            comandoSQLp.setLong(3, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return null;
        } catch(Exception e) {
            System.out.println("Erro de conexão... update parente");
            System.out.println(e);
            return null;
        }
    }
    
}
