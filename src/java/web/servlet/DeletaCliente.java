package web.servlet;

import api.servico.ServicoCliente;
import core.servico.ServicoClienteImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeletaCliente", urlPatterns = {"/deleta-cliente"})
public class DeletaCliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        Long id;
        id = Long.parseLong(req.getParameter("id"));
        
        ServicoCliente sCli = new ServicoClienteImpl();
        sCli.delete(id);
        
        System.out.println("deleta " + id);
    }
}
