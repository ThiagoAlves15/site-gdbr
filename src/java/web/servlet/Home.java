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
            sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
        } catch(Exception e) {
            sc.getRequestDispatcher("/login").forward(req, resp);
        }
    }
}
