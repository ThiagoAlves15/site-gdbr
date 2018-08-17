package web.servlet;

import api.servico.ServicoImagem;
import api.servico.ServicoParente;
import core.servico.ServicoImagemImpl;
import core.servico.ServicoParenteImpl;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AtualizaImagem", urlPatterns = {"/atualiza-imagem"})
public class AtualizaImagem extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();

        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("parenteId");
        
        System.out.println("aqui o session no atualiza parente: " + a);
        
        Long parenteId = a;
        String caminho = req.getParameter("caminho");
        
        ServicoImagem sImg = new ServicoImagemImpl();
        sImg.update(parenteId, caminho);
        sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
    }
}
