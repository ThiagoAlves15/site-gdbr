package web.servlet;

import api.modelo.Administrador;
import api.servico.ServicoAdministrador;
import core.servico.ServicoAdministradorImpl;
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
            ServicoAdministrador sAdministrador = new ServicoAdministradorImpl();
            Administrador pBD = sAdministrador.findByLogin("DonaMaria");
            
            session.setAttribute("administradorId", pBD.getId());
            session.setAttribute("whats", pBD.getWhats());
            session.setAttribute("email", pBD.getEmail());
            System.out.println("a sessao aqui o: "+session.getAttribute("administradorId"));
            System.out.println("a whats aqui o: "+session.getAttribute("whats"));
            System.out.println("a email aqui o: "+session.getAttribute("email"));
            if (session.getAttribute("administradorId") != null) {
                sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
            }
        } catch(Exception e) {
            sc.getRequestDispatcher("/login").forward(req, resp);
        }
    }
}
