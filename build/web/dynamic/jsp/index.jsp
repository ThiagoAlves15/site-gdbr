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
    <script src="${pageContext.request.contextPath}/js/LerMais.js"></script>
  </head>
  <body>
        
        <div class="container">
            
            <!--Banner do Site-->
            <div class="row header">
                <div class="col-md-17">
                    <img class="banner" src="${pageContext.request.contextPath}/img/banner.png" alt="banner"/>    
                </div>

                <!-- Botões -->
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
                    <li><a href="${pageContext.request.contextPath}/dynamic/jsp/tre-cool.jsp">Tré Cool</a></li>
                  </ul>
                </div>
                    
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/quem-somos.jsp" type="button" class="btn btn-success">Quem Somos</a>
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/contato.jsp" type="button" class="btn btn-success">Contato</a>
                    <a href="${pageContext.request.contextPath}/dynamic/jsp/login.jsp" type="button" class="btn btn-success">Login</a>
                </div> 
               
            </div>
            <hr>

            <!--Postagens Principais-->
            <div class="row">
                <div class="col-md-15">
                    <div class="postsprincipais">
                        <div class ="headname">
                        <h3 id="home">Home</h3>
                        </div>
                        <hr>
                        <div class="postagens__showcase">
                            
                        </div>
                    </div>
                </div>
            </div>
            <hr>
        
        </div>
        
    </body>
</html>
