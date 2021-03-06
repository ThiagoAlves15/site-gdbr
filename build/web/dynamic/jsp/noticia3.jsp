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
                    <div class="noticia3">
                        <div class ="headname">
                        <h3 id="home">OUÇA AGORA O NOVO ÁLBUM DE BILLIE JOE ARMSTRONG E ASSISTA AO CLIPE DE ''LOVE IS FOR LOSERS'</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/noticia3.jpg" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Imagem de Divulgação</h5>
                                  <p class="card-text">
                                    Depois de vários dias de mistério, uma conta privada no Instagram que depois se tornou pública e um EP com 3 músicas lançado na semana passada, finalmente foi liberado o álbum completo do novo projeto paralelo de Billie Joe Armstrong, The Longshot.

                                    Intitulado 'Love is for Losers', ele conta com 11 músicas incluindo a faixa-título, 'Taxi Driver' e 'Chasing a Ghost', que já haviam sido lançadas via EP. 

                                    Todas as faixas do álbum foram compostas totalmente pelo frontman do Green Day (letra, guitarra, baixo e bateria), exceto 'Happiness', que teve seu filho Joey na bateria e 'Goodbye To Romance', cover de Ozzy Osbourne.

                                    Veja a tracklist:

                                    1 The Last Time
                                    2 Taxi Driver
                                    3 Chasing a Ghost
                                    4 Body Bag
                                    5 Love is for Losers
                                    6 Cult Hero
                                    7 Kill Your Friends
                                    8 Happiness
                                    9 Soul Surrender
                                    10 Turn Me Loose
                                    11 Goodbye To Romance

                                    Não perca tempo, ouça e conte pra gente quais você mais gostou! Links nos comentários, inclusive do clipe.

                                    Algumas curiosidades sobre as músicas:

                                    - 'Body Bag', foi retrabalhada para o álbum depois de aparecer na trilha sonora do filme 'Ordinary World' estrelado por Billie Joe em 2016. 
                                    - 'The Last Time', primeira canção do CD, foi composta por Armstrong originalmente para o musical These Paper Bullets!.
                                    - Sentiu falta dela? 'Devil's Kind' que vinha aparecendo nos shows e na divulgação pelo Instagram do The Longshot sairá como b-side, segundo Billie..
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