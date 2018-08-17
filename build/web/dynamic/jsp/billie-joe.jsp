<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
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
                    <div class="billie-joe">
                        <div class ="headname">
                        <h3 id="home">Billie Joe Armstrong</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/billie-joe.jpg" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Billie Joe @ Arena Anhenbi, Sao Paulo SP</h5>
                                  <p class="card-text">
                                    Billie Joe Armstrong (nascido em 17 de fevereiro de 1972) é um cantor compositor, músico, ator e multi-instrumentista americano. Ele é mais conhecido como o vocalista e guitarrista e principal compositor da banda de rock Green Day, que Armstrong cofundou com Mike Dirnt. Armstrong também é guitarrista e vocalista da banda de punk rock Pinhead Gunpowder e fornece vocais para projetos paralelos do Green Day como Foxboro Hot Tubs, The Network e The Longshot.
                                    Criado em Rodeo, Califórnia, Armstrong desenvolveu interesse na música quando ainda era muito jovem, e gravou sua primeira música com cinco anos de idade. Ele conheceu Mike Dirnt enquanto frequentava a escola primária, e os dois ligados instantaneamente sobre o interesse mútuo em música, formando a banda Sweet Children, quando os dois tinham 15 anos de idade. A banda mudou seu nome para Green Day, e viria a alcançar o sucesso comercial massivo. Armstrong também tem buscado projetos musicais fora do Green Day, incluindo inúmeras colaborações com outros músicos, além de se dedicar ao desenho.
                                    Em 1997, para coincidir com o lançamento do Nimrod, Armstrong fundou Adeline Records, em Oakland para ajudar a apoiar outras bandas lançando músicas de bandas como The Frustrators, AFI e Dillinger Four. A gravadora, desde então, vem sob a gestão de Pat Magnarella e agora está sediada em San Diego.
                                    Em 2015, foi eleito o 93° compositor de todos os tempos pela Rolling Stone.
                                  </p>
                                  <hr>
                                </div>
                            </div>
                        <hr>

                    </div>
                </div>
            </div>
            <hr>
        
        </div>
        
    </body>