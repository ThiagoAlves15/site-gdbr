<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <title>Green Day Brasil</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
        <script src="${pageContext.request.contextPath}/js/VisualizarPost.js"></script>
        <script src="${pageContext.request.contextPath}/js/submitPost.js"></script>
    </head>
    
    
    <body>
        
        <div class="container">
            
            <!--Banner do Site-->
            <div class="row">
                <div class="col-md-17">
                   <img class="banner" src="${pageContext.request.contextPath}/img/banner.png" alt="banner"/>     
                </div>

                <!-- BotÃµes -->
                <div class="btn-group" role="group" aria-label="Button group with nested dropdown">
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/index.jsp" type="button" class="btn btn-success">Home</a>
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/tour.jsp" type="button" class="btn btn-success">Tour</a>
                    
                <div class="btn-group">
                  <a href="${pageContext.request.contextPath}/dynamic/jsp/banda.jsp" type="button" class="btn btn-success">Banda</a>
                  <button type="button" class="btn btn-success dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <span class="caret"></span>
                    <span class="sr-only">Toggle Dropdown</span>
                  </button>
                  <ul class="dropdown-menu">
                    <li><a href="${pageContext.request.contextPath}/dynamic/jsp/billie-joe.jsp">Billie Joe</a></li>
                    <li><a href="${pageContext.request.contextPath}/dynamic/jsp/mike-dirnt.jsp">Mike Dirnt</a></li>
                    <li><a href="${pageContext.request.contextPath}/dynamic/jsp/tre-cool.jsp">TrÃ© Cool</a></li>
                  </ul>
                </div>
                    
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/quem-somos.jsp" type="button" class="btn btn-success">Quem Somos</a>
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/contato.jsp" type="button" class="btn btn-success">Contato</a>
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/login.jsp" type="button" class="btn btn-success">Login</a>
                </div> 
               
            </div>
            <hr>

            <!--Painel Administrativo - Adicionar Postagem-->
            <div class="row">
                <div class="col-md-15">
                    <div class="painel-admin">
                        <h3>Adicionar Postagem</h3>
                        <hr>
                            <form id="form_upload" name="form_upload" action="${pageContext.request.contextPath}/adiciona-postagem" method="post">
                            <div class="form-group">
                                <label for="titulo">Titulo</label>
                                <input type="text" class="form-control" id="titulo" name="titulo" placeholder="TÃ­tulo da Postagem">
                              </div>
                              <div class="form-group">
                                <label for="postagem">Postagem</label>
                                <textarea class="form-control" id="postagem" name="texto" rows="5"></textarea>
                              </div>
                              <div class="form-group">
                                <label for="imagemdestaque">Imagem de Destaque</label>
                                <input type="file" class="form-control-file" name="caminho" id="imagemdestaque">
                              </div>
                              <button class="btn btn-success" type="button" onclick="VisualizarPost()">Visualizar</button>
                              <input class="btn btn-success" type="submit" value="Submeter" id="submit"/>
                            </form>
                    </div>
                    
                    <div id="visualizar-post">
                        <hr>

                    </div>
                </div>
              <div class="container">
                <div class="container header">
                  <label for="dados">Alterar seus dados</label>
                </div>
                <form id="form_dados" name="form_dados" action="${pageContext.request.contextPath}/atualiza-administrador" method="post">
                  <label for="login">Login:</label>
                  <input type="text" placeholder="Login" name="login" id="login" maxlength="50">
                  <label for="senha">Senha:</label>
                  <input type="password" placeholder="Senha" name="senha" id="senha" maxlength="30" required>
                  <label for="email">Email:</label>
                  <input type="email" placeholder="name@email.com" name="email" id="email" required>
                  <button id="dados" type="submit">Enviar Dados</button>
                </form>
              </div>
                  
              <div class="container">
                <div class="container header">
                  <label for="procurar">Deletar fotos da página principal</label>
                </div>
                <div class="container">
                  <div class="container header">
                    <label>Escolher foto para deletar</label>
                    <div class="showcase__background">
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <hr>
        
        </div>
    </body>
</html>
