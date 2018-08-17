package web.servlet;

import api.modelo.Postagem;
import api.servico.ServicoPostagem;
import core.servico.ServicoPostagemImpl;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.*;

@WebServlet(name = "RetornaPostagens", urlPatterns = {"/postagens"})
public class RetornaPostagens extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext sc = req.getServletContext();
        resp.setContentType("application/json");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Cache-Control", "nocache");
        PrintWriter out = resp.getWriter();
        
        try {
            JSONObject dataObject;
            JSONObject jsonObject = new JSONObject();
            JSONArray jsonArray = new JSONArray();
            
            ServicoPostagem sPostagem = new ServicoPostagemImpl();
            ArrayList<Postagem> postagens = sPostagem.findAllPostagens();

            for (Postagem p : postagens) {
                dataObject = new JSONObject();
                dataObject.put("id", p.getId());
                dataObject.put("caminho_imagem_postagem", p.getCaminho());
                dataObject.put("titulo_postagem", p.getTitulo());
                dataObject.put("texto_postagem", p.getTexto());
                dataObject.put("administrador_id", p.getAdministrador());
                dataObject.put("criado_em_postagem", p.getCriadoEm());
                jsonArray.put(dataObject);
            }
            
            jsonObject.put("postagens", jsonArray);
            
            System.out.println(jsonArray);
            
            out.print(jsonObject.toString());

        } catch(Exception e) {
            System.out.println("não deu para pegar as postagens");
            System.out.println(e);
        }
    }
}
