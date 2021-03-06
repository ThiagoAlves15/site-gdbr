package core.dao;

import api.modelo.Contato;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import api.dao.ContatoDAO;

public class ContatoDAOMariaDB implements ContatoDAO{
    Connection conexao;
    public ContatoDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gdbr", "grazi", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.print("\nErro de conexão ContatoDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Contato insert(Contato contato) {
        try {
            String query = "insert into contatos (nome_contato, email_contato, telefone_contato, celular_contato, mensagem_contato) values(?, ?, ?, ?, ?)";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, contato.getNome());
            comandoSQLp.setString(2, contato.getEmail());
            comandoSQLp.setString(3, contato.getTelefone());
            comandoSQLp.setString(4, contato.getCelular());
            comandoSQLp.setString(5, contato.getMensagem());
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return contato;
        } catch(Exception e) {
            System.out.println("Erro de conexão... insert contato");
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Contato findById(Long id) {
        Contato c = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from contatos where id_contato = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            c = new Contato();
            c.setId(rs.getLong(1));
            c.setNome(rs.getString(2));
            c.setEmail(rs.getString(3));
            c.setTelefone(rs.getString(4));
            c.setCelular(rs.getString(5));
            c.setMensagem(rs.getString(6));     

            comandoSQLp.close();
            rs.close();
            return c;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id Contato.");
          e.printStackTrace();
        }
        return c;
    }

    @Override
    public ArrayList<Contato> findByNomeContato(String nome){
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        
        try {
            String query = "select * from contatos where nome_contato ilike '?%' order by nome_contato asc";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, nome);
            ResultSet rs = comandoSQLp.executeQuery();
            
            while(rs.next()) {
                Contato c = new Contato();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setMensagem(rs.getString("mensagem"));
                
                contatos.add(c);
            }
            
            comandoSQLp.close();
            rs.close();
        } catch(Exception e) {
            System.out.println("Erro de conexão... get contatos");
            System.out.println(e);
        }
        
        return contatos;
    }
    
    @Override
    public ArrayList<Contato> findAllContatos(){
        ArrayList<Contato> contatos = new ArrayList<Contato>();
        
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from contatos order by nome_contato desc");  
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                Contato c = new Contato();
                c.setId(rs.getLong("id"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setMensagem(rs.getString("mensagem"));
                
                contatos.add(c);
            }

            comandoSQLp.close();
            rs.close();
            return contatos;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão... contatoDAOMysql find all.");
          e.printStackTrace();
        }
        return contatos;
    }

    @Override
    public boolean delete(Long id) {
        try {
            String query = "delete from contatos where id_contato = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setLong(1, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return true;
        } catch(Exception e) {
            System.out.println("Erro de conexão... delete contato");
            System.out.println(e);
            return false;
        }
    }
}
