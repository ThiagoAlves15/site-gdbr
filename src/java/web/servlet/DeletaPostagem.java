package web.servlet;

import api.servico.ServicoPostagem;
import core.servico.ServicoPostagemImpl;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeletaPostagem", urlPatterns = {"/deleta-postagem"})
public class DeletaPostagem extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        Long id = Long.parseLong(req.getParameter("id"));
        
        ServicoPostagem sImg = new ServicoPostagemImpl();
        sImg.delete(id);
        
        System.out.println("deleta " + id);
    }
}
