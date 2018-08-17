package web.servlet;

import api.servico.ServicoContato;
import core.servico.ServicoContatoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeletaContato", urlPatterns = {"/deleta-contato"})
public class DeletaContato extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        Long id;
        id = Long.parseLong(req.getParameter("id"));
        
        ServicoContato sCli = new ServicoContatoImpl();
        sCli.delete(id);
        
        System.out.println("deleta " + id);
    }
}
