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
    <script src="${pageContext.request.contextPath}/js/submitPost.js"></script>
  </head>
  <body>
    <div class="container">
        
        <!--Banner do Site-->
            <div class="row header">
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
        <div class="row">
                <div class="col-md-15">
                    <div class="painel-admin">
                        <h3>Contato</h3>
                        <hr>
                        <form id="form_id" name="myform" action="${pageContext.request.contextPath}/form" method="post">
                          <label for="name">Nome Completo *</label>
                          <input type="text" placeholder="Nome Completo" name="nome_contato" id="name" required>
                          <div class="tipo-contato">
                            <p class="mensgem-vermelha">Preencha pelo menos um dos tipos de contato abaixo:</p>
                            <label for="email">Email</label>
                            <input type="email" placeholder="name@email.com.br" name="email_contato" id="email">
                            <label for="telefone">Telefone</label>
                            <input type="tel" placeholder="(xx)xxxx-xxxx" name="telefone_contato" id="telefone" maxlength="14">
                            <label for="celular">Celular</label>
                            <input type="tel" placeholder="(xx)xxxxx-xxxx" name="celular_contato" id="celular" maxlength="15">
                          </div>
                          <label for="mensagem">Mensagem *</label>
                          <textarea  rows="4" cols="30" placeholder="Mande uma mensagem :D" name="mensagem_contato" id="mensagem" required></textarea>
                          <p class="mensgem-vermelha">*: Campo obrigatório</p>
                          <button id="enviar" type="submit">Enviar Dados</button>
                       </form>
                    </div>
                </div>
        </div>
    </div>
  </body>
</html>
<!-- https://www.sitepoint.com/client-side-form-validation-html5/ -->
