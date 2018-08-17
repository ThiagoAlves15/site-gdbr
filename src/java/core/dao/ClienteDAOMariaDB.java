package core.dao;

import api.modelo.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import api.dao.ClienteDAO;
import java.util.ArrayList;

public class ClienteDAOMariaDB implements ClienteDAO{
    Connection conexao;
    public ClienteDAOMariaDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mariadb://localhost:3306/portfolio", "thiago", "1234");
            System.out.println("foi");
        } catch (Exception e){
            System.out.print("\nErro de conexão ClienteDAOmariadb.");
            e.printStackTrace();
        }
    }
    
    @Override
    public Cliente insert(Cliente cliente) {
        try {
            String query = "insert into clientes (nome_cliente, email_cliente, telefone_cliente, celular_cliente, mensagem_cliente, parente_id) values(?, ?, ?, ?, ?, ?)";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setString(1, cliente.getNome());
            comandoSQLp.setString(2, cliente.getEmail());
            comandoSQLp.setString(3, cliente.getTelefone());
            comandoSQLp.setString(4, cliente.getCelular());
            comandoSQLp.setString(5, cliente.getMensagem());
            comandoSQLp.setLong(6, cliente.getParente());
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return cliente;
        } catch(Exception e) {
            System.out.println("Erro de conexão... insert cliente");
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Cliente findById(Long id) {
        Cliente c = null;
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.clientes where id_cliente = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            c = new Cliente();
            c.setId(rs.getLong(1));
            c.setNome(rs.getString(2));
            c.setEmail(rs.getString(3));
            c.setTelefone(rs.getString(4));
            c.setCelular(rs.getString(5));
            c.setMensagem(rs.getString(6));
            c.setParente(rs.getLong(7));     

            comandoSQLp.close();
            rs.close();
            return c;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id cliente.");
          e.printStackTrace();
        }
        return c;
    }

    @Override
    public ArrayList<Cliente> findByNomeCliente(Long parenteId, String nome){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try {
            String query = "select * from clientes where clientes.parente_id = ? and clientes.nome ilike '?%' order by clientes.nome asc";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setLong(1, parenteId);
            comandoSQLp.setString(2, nome);
            ResultSet rs = comandoSQLp.executeQuery();
            
            while(rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong("id"));
                c.setParente(rs.getLong("parenteId"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setMensagem(rs.getString("mensagem"));
                
                clientes.add(c);
            }
            
            comandoSQLp.close();
            rs.close();
        } catch(Exception e) {
            System.out.println("Erro de conexão... get clientes");
            System.out.println(e);
        }
        
        return clientes;
    }
    
    @Override
    public ArrayList<Cliente> findByIdParente(Long parenteId){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from portfolio.clientes where parente_id = ? order by nome_cliente desc");  
            comandoSQLp.setLong(1, parenteId);
            ResultSet rs = comandoSQLp.executeQuery();
            while(rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getLong("id"));
                c.setParente(rs.getLong("parenteId"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setMensagem(rs.getString("mensagem"));
                
                clientes.add(c);
            }

            comandoSQLp.close();
            rs.close();
            return clientes;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão... ClienteDAOMysql find by parente id.");
          e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public boolean delete(Long id) {
        try {
            String query = "delete from clientes where id_cliente = ?";
            PreparedStatement comandoSQLp = conexao.prepareStatement(query);
            comandoSQLp.setLong(1, id);
            comandoSQLp.executeQuery();
            comandoSQLp.close();
            return true;
        } catch(Exception e) {
            System.out.println("Erro de conexão... delete cliente");
            System.out.println(e);
            return false;
        }
    }
}
