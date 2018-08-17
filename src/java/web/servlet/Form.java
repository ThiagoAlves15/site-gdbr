package web.servlet;

import api.modelo.Contato;
import api.modelo.Administrador;
import api.servico.ServicoContato;
import api.servico.ServicoAdministrador;
import core.servico.ServicoContatoImpl;
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

@WebServlet(name = "Form", urlPatterns = {"/form"})
public class Form extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        try {
            HttpSession session = req.getSession();
            ServicoAdministrador sAdministrador = new ServicoAdministradorImpl();
            Administrador pBD = sAdministrador.findByLogin("Grazi");
            
            session.setAttribute("administradorId", pBD.getId());
            System.out.println("a sessao aqui o no form: "+session.getAttribute("administradorId"));
            sc.getRequestDispatcher("/dynamic/jsp/form.jsp").forward(req, resp);
        } catch(Exception e) {
            System.out.println("exceçao form");
            e.printStackTrace();
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, ServletException, IOException {
        ServletContext sc = req.getServletContext();
        
        req.setCharacterEncoding("UTF-8");
        resp.setHeader("Cache-Control", "nocache");
        
        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("administradorId");
        
        System.out.println("aqui o session no form: " + a);
        
        Long administradorId = a;
        String nome = req.getParameter("nome_contato");
        String email = req.getParameter("email_contato");
        String telefone = req.getParameter("telefone_contato");
        String celular = req.getParameter("celular_contato");
        String mensagem = req.getParameter("mensagem_contato");
        
        ServicoContato sCli = new ServicoContatoImpl();
        Contato contato = new Contato(nome, email, telefone, celular, mensagem, administradorId);
        sCli.insert(contato);
        
        sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
    }
}
