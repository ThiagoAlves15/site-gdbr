<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Contato</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/form.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/form.js"></script>
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/imgs/favicon.ico">
  </head>
  <body>
    <div class="container">
      <h2>Formulário para contato:</h2>
      <form id="form_id" name="myform" action="${pageContext.request.contextPath}/form" method="post">
        <label for="name">Nome Completo *</label>
        <input type="text" placeholder="Nome Completo" name="nome_cliente" id="name" required>
        <div class="tipo-contato">
          <p class="mensgem-vermelha">Preencha pelo menos um dos tipos de contato abaixo:</p>
          <label for="email">Email</label>
          <input type="email" placeholder="name@email.com.br" name="email_cliente" id="email">
          <label for="telefone">Telefone</label>
          <input type="tel" placeholder="(xx)xxxx-xxxx" name="telefone_cliente" id="telefone" maxlength="14">
          <label for="celular">Celular</label>
          <input type="tel" placeholder="(xx)xxxxx-xxxx" name="celular_cliente" id="celular" maxlength="15">
        </div>
        <label for="mensagem">Mensagem *</label>
        <textarea  rows="4" cols="30" placeholder="Mande uma mensagem :D" name="mensagem_cliente" id="mensagem" required></textarea>
        <p class="mensgem-vermelha">*: Campo obrigatório</p>
        <button id="enviar" type="submit">Enviar Dados</button>
     </form>
    </div>
  </body>
</html>
<!-- https://www.sitepoint.com/client-side-form-validation-html5/ -->
