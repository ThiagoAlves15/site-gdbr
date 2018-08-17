<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <title>Configuração</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/bootstrap-datepicker-1.6.4-dist/css/bootstrap-datepicker3.min.css" />
      <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/config.css" />
      <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/config.js"></script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/assets/jquery-3.3.1.min.js"></script>
      <script type="text/javascript" src="${pageContext.request.contextPath}/assets/bootstrap-datepicker-1.6.4-dist/js/bootstrap-datepicker.min.js"></script>
      <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/imgs/favicon.ico">
    </head>
    <body>
      <div class="container">
        <div class="container header">
          <label for="upload">Upload de imagens para página principal</label>
        </div>
        <form id="form_upload" name="form_upload" action="${pageContext.request.contextPath}/adiciona-imagem" method="post">
          <label for="up">Caminho da foto:</label>
          <input type="file" name="caminho" id="up" required>
          <button id="upload" type="submit">Enviar Dados</button>
        </form>
      </div>
      <div class="container">
        <div class="container header">
          <label for="dados">Alterar seus dados de contato</label>
        </div>
        <form id="form_dados" name="form_dados" action="${pageContext.request.contextPath}/atualiza-parente" method="post">
          <label for="login">Login:</label>
          <input type="text" placeholder="Login" name="login" id="login" maxlength="50">
          <label for="whats">WhatsApp:</label>
          <input type="text" placeholder="WhatsApp - (xx)xxxxx-xxxx" name="whats" id="whats" maxlength="15" required>
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
    </body>
</html>
