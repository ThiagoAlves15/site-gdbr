package web.servlet;

import api.modelo.Contato;
import api.servico.ServicoContato;
import core.servico.ServicoContatoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.*;

@WebServlet(name = "RetornaContatos", urlPatterns = {"/contatos"})
public class RetornaContatos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        resp.setContentType("application/json");
        resp.setHeader("Cache-Control", "nocache");
        resp.setCharacterEncoding("utf-8");
        PrintWriter out = resp.getWriter();
        
        JSONObject dataObject;
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        
        try {
            ServicoContato sCli = new ServicoContatoImpl();
            ArrayList<Contato> contatos = sCli.findAllContatos();

            for (Contato contato : contatos) {
                dataObject = new JSONObject();
                dataObject.put("id_contatos", contatos.getId());
                dataObject.put("nome_contatos", contatos.getNome());
                dataObject.put("email_contatos", contatos.getEmail());
                dataObject.put("telefone_contatos", contatos.getTelefone());
                dataObject.put("celular_contatos", contatos.getCelular());
                dataObject.put("mensagem_contatos", contatos.getMensagem());
                dataObject.put("administrador_id", contatos.getAdministrador());
                jsonArray.put(dataObject);
            }
            
            jsonObject.put("contatos", jsonArray);
            
            out.print(jsonObject.toString());
        } catch(Exception e) {
            System.out.println("não deu para pegar os contatos");
            System.out.println(e);
        }
    }
}
