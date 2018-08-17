package web.servlet;

import api.servico.ServicoPostagem;
import api.servico.ServicoAdministrador;
import core.servico.ServicoPostagemImpl;
import core.servico.ServicoAdministradorImpl;
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

@WebServlet(name = "AtualizaPostagem", urlPatterns = {"/atualiza-postagem"})
public class AtualizaPostagem extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();

        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("administradorId");
        
        System.out.println("aqui o session no atualiza administrador: " + a);
        
        Long administradorId = a;
        String caminho = req.getParameter("caminho");
        
        ServicoPostagem sImg = new ServicoPostagemImpl();
        sImg.update(administradorId, caminho);
        sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
    }
}
