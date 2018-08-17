package web.servlet;

import api.servico.ServicoImagem;
import core.servico.ServicoImagemImpl;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DeletaImagem", urlPatterns = {"/deleta-imagem"})
public class DeletaImagem extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        Long id = Long.parseLong(req.getParameter("id"));
        
        ServicoImagem sImg = new ServicoImagemImpl();
        sImg.delete(id);
        
        System.out.println("deleta " + id);
    }
}
