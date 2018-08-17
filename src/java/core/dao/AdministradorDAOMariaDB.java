package core.dao;

import api.dao.AdministradorDAO;
import api.modelo.Administrador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdministradorDAOMariaDB implements AdministradorDAO{

    Connection conexao;
    
    public AdministradorDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdbr", "grazi", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.println("\nErro de conexão AdministradorDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Administrador findById(Long id) {
        Administrador p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from administradores where id_administrador = ?");  
            comandoSQLp.setLong(1, id);
            ResultSet rs = comandoSQLp.executeQuery();
            rs.next();
            p = new Administrador();
            p.setId((rs.getLong("id_administrador")));
            p.setLogin(rs.getString("login_administrador"));
            p.setSenha(rs.getString("senha_administrador"));
            p.setEmail(rs.getString("email_administrador"));

            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return p;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão... AdministradorDAOmariadb find by id.");
          e.printStackTrace();
        }
        return p;
    }

    @Override
    public Administrador findByLogin(String login){
        Administrador p = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from administradores where login_administrador = ?");  
            comandoSQLp.setString(1, login);
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectado...");
            rs.next();
            p = new Administrador();
            p.setId((rs.getLong("id_administrador")));
            p.setLogin(rs.getString("login_administrador"));
            p.setSenha(rs.getString("senha_administrador"));
            p.setEmail(rs.getString("email_administrador"));
            comandoSQLp.close();
            rs.close();
            conexao.close();
            return p;
        }           
        catch (Exception e)
        {
          System.out.println("\nErro de conexão...Find by nome contato.");
          e.printStackTrace();
        }
        return p;
    }
    
    @Override
    public Administrador update(Long id, String login, String senha, String email) {
        try {
            String query = "update administradores set login_administrador = ?, senha_administrador = ?, email_administrador = ? where id_administrador = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, login);
            comandoSQLp.setString(2, senha);
            comandoSQLp.setString(3, email);
            comandoSQLp.setLong(4, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return null;
        } catch(Exception e) {
            System.out.println("Erro de conexão... update administrador");
            System.out.println(e);
            return null;
        }
    }
    
}
