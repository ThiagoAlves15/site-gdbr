package web.servlet;

import api.modelo.Postagem;
import api.modelo.Administrador;
import api.servico.ServicoPostagem;
import core.servico.ServicoPostagemImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "AdicionaPostagem", urlPatterns = {"/adiciona-postagem"})
public class AdicionaPostagem extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, ServletException, IOException {
        ServletContext sc = req.getServletContext();
        
        req.setCharacterEncoding("UTF-8");
        resp.setHeader("Cache-Control", "nocache");
        
        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("administradorId");
        
        System.out.println("aqui o session no adiciona Postagem: " + a);
        
        Long administradorId = a;
        String caminho = req.getParameter("caminho");
        String titulo = req.getParameter("titulo");
        String texto = req.getParameter("texto");
        Timestamp criadoEm = new java.sql.Timestamp(new Date().getTime());
        
        ServicoPostagem sImg = new ServicoPostagemImpl();
        Postagem postagem = new Postagem(caminho, titulo, texto, criadoEm, administradorId);
        sImg.insert(postagem);
        
        sc.getRequestDispatcher("/dynamic/jsp/admin.jsp").forward(req, resp);
    }
}
