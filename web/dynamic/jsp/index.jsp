<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <title>Site da Dona Maria</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/index.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/fonts/Champagne_Limousines.ttf" />
    <!--<link rel="stylesheet" type="text/css" href="/assets/bootstrap-4.1.0-dist/css/bootstrap.min.css" />-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/index.js"></script>
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/imgs/favicon.ico">
  </head>
  <body>
    <div class="watermark__wrapper">
	  <img class="watermark" src="${pageContext.request.contextPath}/assets/imgs/favicon.ico"></span>
    </div>
    <div class="header">
      <a class="header__link" href="form.html">
        <img class="header__icon" src="${pageContext.request.contextPath}/assets/imgs/favicon.ico"></span>
        <img class="header__image" src="${pageContext.request.contextPath}/assets/imgs/biscuit.jpg" alt="Entre em contato!">
      </a>
    </div>
    <div class="center_menu">
      <ul class="menu">
        <li>
          <a href="${pageContext.request.contextPath}/form" class="btn btn-primary btn-lg btn-block"> Entre em contato</a>
        </li>
        <li>
          <a href="${pageContext.request.contextPath}/login" class="btn btn-primary btn-lg btn-block"> Login</a>
        </li>
      </ul>
    </div>
    <div class="showcase__background">
    </div>
    <div class="footer">
      <div id="whats" class="footer_info">WhatsApp: <span><%= request.getSession().getAttribute("whats") %></span></div>
      <div id="email" class="footer_info">Email: <span><%= request.getSession().getAttribute("email") %></span></div>
    </div>
  </body>
</html>
