package web.servlet;

import api.modelo.Imagem;
import api.servico.ServicoImagem;
import core.servico.ServicoImagemImpl;
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

@WebServlet(name = "RetornaImagensPorParente", urlPatterns = {"/imagens-parente"})
public class RetornaImagensPorParente extends HttpServlet {
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
            HttpSession session = req.getSession(false);
            Long id = (Long) session.getAttribute("parenteId");
            
            System.out.println("o id aqui o:" + id);
            
            if (id == null) {
                System.out.println("asdasdasffdsagafgsd");
                throw new IllegalStateException();
            } else {
                ServicoImagem sImagem = new ServicoImagemImpl();
                ArrayList<Imagem> imagens = sImagem.findByIdParente(id);

                for (Imagem i : imagens) {
                    dataObject = new JSONObject();
                    dataObject.put("id", i.getId());
                    dataObject.put("caminho_imagem", i.getCaminho());
                    dataObject.put("parente_id", i.getParente());
                    dataObject.put("criado_em_imagem", i.getCriadoEm());
                    jsonArray.put(dataObject);
                }
                
                jsonObject.put("imagens", jsonArray);
                
                System.out.println(jsonArray);
                
                out.print(jsonObject.toString());
            }
        } catch(Exception e) {
            System.out.println("não deu para pegar as imagens");
            System.out.println(e);
        }
    }
}
