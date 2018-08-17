package web.servlet;

import api.modelo.Cliente;
import api.modelo.Parente;
import api.servico.ServicoCliente;
import api.servico.ServicoParente;
import core.servico.ServicoClienteImpl;
import core.servico.ServicoParenteImpl;
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
            ServicoParente sParente = new ServicoParenteImpl();
            Parente pBD = sParente.findByLogin("DonaMaria");
            
            session.setAttribute("parenteId", pBD.getId());
            System.out.println("a sessao aqui o no form: "+session.getAttribute("parenteId"));
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
        Long a = (Long) session.getAttribute("parenteId");
        
        System.out.println("aqui o session no form: " + a);
        
        Long parenteId = a;
        String nome = req.getParameter("nome_cliente");
        String email = req.getParameter("email_cliente");
        String telefone = req.getParameter("telefone_cliente");
        String celular = req.getParameter("celular_cliente");
        String mensagem = req.getParameter("mensagem_cliente");
        
        ServicoCliente sCli = new ServicoClienteImpl();
        Cliente cliente = new Cliente(nome, email, telefone, celular, mensagem, parenteId);
        sCli.insert(cliente);
        
        sc.getRequestDispatcher("/dynamic/jsp/index.jsp").forward(req, resp);
    }
}
