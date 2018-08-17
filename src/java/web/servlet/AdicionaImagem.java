package web.servlet;

import api.modelo.Imagem;
import api.modelo.Parente;
import api.servico.ServicoImagem;
import core.servico.ServicoImagemImpl;
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

@WebServlet(name = "AdicionaImagem", urlPatterns = {"/adiciona-imagem"})
public class AdicionaImagem extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, ServletException, IOException {
        ServletContext sc = req.getServletContext();
        
        req.setCharacterEncoding("UTF-8");
        resp.setHeader("Cache-Control", "nocache");
        
        HttpSession session = req.getSession();
        Long a = (Long) session.getAttribute("parenteId");
        
        System.out.println("aqui o session no adiciona imagem: " + a);
        
        Long parenteId = a;
        String caminho = req.getParameter("caminho");
        Timestamp criadoEm = new java.sql.Timestamp(new Date().getTime());
        
        ServicoImagem sImg = new ServicoImagemImpl();
        Imagem imagem = new Imagem(caminho, criadoEm, parenteId);
        sImg.insert(imagem);
        
        sc.getRequestDispatcher("/dynamic/jsp/config.jsp").forward(req, resp);
    }
}
