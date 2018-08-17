package web.servlet;

import api.modelo.Parente;
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

@WebServlet(name = "Config", urlPatterns = {"/config"})
public class Config extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        try {
            HttpSession session = req.getSession();
            ServicoParente sParente = new ServicoParenteImpl();
            Parente pBD = sParente.findByLogin("DonaMaria");
            
            session.setAttribute("parenteId", pBD.getId());
            System.out.println("a sessao aqui o no config: "+session.getAttribute("parenteId"));
            sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
        } catch(Exception e) {
            System.out.println("exceçao form");
            e.printStackTrace();
        }
    }
}
