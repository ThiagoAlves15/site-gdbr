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

@WebServlet(name = "Config", urlPatterns = {"/config"})
public class Config extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        try {
            HttpSession session = req.getSession();
            ServicoAdministrador sAdministrador = new ServicoAdministradorImpl();
            Administrador pBD = sAdministrador.findByLogin("DonaMaria");
            
            session.setAttribute("administradorId", pBD.getId());
            System.out.println("a sessao aqui o no config: "+session.getAttribute("administradorId"));
            sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
        } catch(Exception e) {
            System.out.println("exceçao form");
            e.printStackTrace();
        }
    }
}
