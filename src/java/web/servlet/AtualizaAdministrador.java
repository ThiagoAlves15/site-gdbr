package web.servlet;

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

@WebServlet(name = "AtualizaAdministrador", urlPatterns = {"/atualiza-administrador"})
public class AtualizaAdministrador extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        
        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("administradorId");
        
        System.out.println("aqui o session no atualiza administrador: " + a);
        
        Long administradorId = a;
        String whats = req.getParameter("whats");
        String email = req.getParameter("email");
        
        ServicoAdministrador sPar = new ServicoAdministradorImpl();

        sPar.update(administradorId, whats, email);
        sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
    }
}
