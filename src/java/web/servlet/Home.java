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

@WebServlet(name = "Home", urlPatterns = {""})
public class Home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        try {
            HttpSession session = req.getSession();
            ServicoParente sParente = new ServicoParenteImpl();
            Parente pBD = sParente.findByLogin("DonaMaria");
            
            session.setAttribute("parenteId", pBD.getId());
            session.setAttribute("whats", pBD.getWhats());
            session.setAttribute("email", pBD.getEmail());
            System.out.println("a sessao aqui o: "+session.getAttribute("parenteId"));
            System.out.println("a whats aqui o: "+session.getAttribute("whats"));
            System.out.println("a email aqui o: "+session.getAttribute("email"));
            if (session.getAttribute("parenteId") != null) {
                sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
            }
        } catch(Exception e) {
            sc.getRequestDispatcher("/login").forward(req, resp);
        }
    }
}
