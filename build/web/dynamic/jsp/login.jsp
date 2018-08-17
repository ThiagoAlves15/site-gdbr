<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:if test="${not empty falhaAutenticacao}">
    <script>
        window.addEventListener("load", function() {
            alert("${falhaAutenticacao}");
        });
    </script>
</c:if> 

<!DOCTYPE html>
<html>
    <head>
        <title>Login (apenas a Dona Maria)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/login.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/javascript/login.js"></script>
        <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/imgs/favicon.ico">
    </head>
    <body>
        <div class="img_container">
          <img src="${pageContext.request.contextPath}/assets/imgs/favicon.ico" alt="Avatar" class="avatar">
        </div>
        <div class="container">
          <form id="form_id" name="myform" action="${pageContext.request.contextPath}/login" method="post">
            <label for="username">Username</label>
            <input id="login" name="login" type="text" placeholder="Enter Username" required>
            <label for="password">Password</label>
            <input id="senha" name="senha" type="password" placeholder="Enter Password" required>
            <button id="logar" type="submit">Login</button>
          </form>
        </div>
    </body>
</html>
