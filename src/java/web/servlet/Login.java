package web.servlet;

import api.modelo.Administrador;
import api.servico.ServicoAdministrador;
import core.servico.ServicoAdministradorImpl;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/login"})
public class Login extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        ServletContext sc = req.getServletContext();
        try {
            sc.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
        } catch(Exception e) {
            System.out.println("exceçao login");
            e.printStackTrace();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");
        
        System.out.println("login: " + login);
        System.out.println("senha: " + senha);
        
        ServicoAdministrador sPar = new ServicoAdministradorImpl();
        Administrador p = sPar.findByLogin(login);
        
        System.out.println(p);
        
        ServletContext sc = req.getServletContext();
        HttpSession session = req.getSession();
        
        if (p != null && p.getSenha().equals(senha)) {
            try {
                session.setAttribute("administradorLogado", p);
                session.setAttribute("login_administrador", p.getLogin());
                sc.getRequestDispatcher("/admin").forward(req, resp);
            } catch(Exception e) {
               System.out.println("erro ao comunicar com servidor.");
               System.out.println(e);
            }            
        } else {
            try {
                req.setAttribute("falhaAutenticacao", "Nome e/ou senha inválidos!");
                System.out.println("falha");
                sc.getRequestDispatcher("/dynamic/jsp/login.jsp").forward(req, resp);
            } catch(Exception e) {
                //Tratamento de erro de IO ou de Servlet..
                System.out.println("erro no erro");
                e.printStackTrace();
            }  
        }
    }
}
