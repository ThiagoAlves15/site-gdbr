package web.servlet;

import api.servico.ServicoParente;
import core.servico.ServicoParenteImpl;
import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AtualizaParente", urlPatterns = {"/atualiza-parente"})
public class AtualizaParente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        
        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("parenteId");
        
        System.out.println("aqui o session no atualiza parente: " + a);
        
        Long parenteId = a;
        String whats = req.getParameter("whats");
        String email = req.getParameter("email");
        
        ServicoParente sPar = new ServicoParenteImpl();

        sPar.update(parenteId, whats, email);
        sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
    }
}
