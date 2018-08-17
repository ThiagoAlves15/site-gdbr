package web.servlet;

import api.modelo.Cliente;
import api.servico.ServicoCliente;
import core.servico.ServicoClienteImpl;
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

@WebServlet(name = "RetornaClientesPorParente", urlPatterns = {"/clientes"})
public class RetornaClientesPorParente extends HttpServlet {
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
            HttpSession session = req.getSession(false);
            Long id = (Long) session.getAttribute("parenteId");
            
            if (id == null) {
                resp.sendRedirect("/");
            } else {
                ServicoCliente sCli = new ServicoClienteImpl();
                ArrayList<Cliente> clientes = sCli.findByIdParente(id);

                for (Cliente cliente : clientes) {
                    dataObject = new JSONObject();
                    dataObject.put("id_cliente", cliente.getId());
                    dataObject.put("nome_cliente", cliente.getNome());
                    dataObject.put("email_cliente", cliente.getEmail());
                    dataObject.put("telefone_cliente", cliente.getTelefone());
                    dataObject.put("celular_cliente", cliente.getCelular());
                    dataObject.put("mensagem_cliente", cliente.getMensagem());
                    dataObject.put("parente_id", cliente.getParente());
                    jsonArray.put(dataObject);
                }
                
                jsonObject.put("clientes", jsonArray);
                
                out.print(jsonObject.toString());
            }
        } catch(Exception e) {
            System.out.println("não deu para pegar os clientes");
            System.out.println(e);
        }
    }
}
