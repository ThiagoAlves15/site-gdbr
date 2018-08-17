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
                    <div class="noticia1">
                        <div class ="headname">
                        <h3 id="home">THE LONGSHOT ANUNCIA OFICIALMENTE A PRIMEIRA TURNÊ.</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/noticia11.jpg" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Imagem de Divulgação da Turnê</h5>
                                  <p class="card-text">
                                    A poucos minutos, Billie Joe Armstrong, anunciou no Instagram as 19 datas da turnê da The Longshot pela América do Norte.

                                    O giro terá duração de 1 mês e os shows iniciam no dia 3 de maio, em Tijuana, no México, e encerram no dia 2 de junho na Filadélfia.

                                    03/05 - The Moustache, Tijuana, México 
                                    04/05 - Beauty Bar Vegas, Las Vegas, Nevada 
                                    05/05 - Valley Bar, Phoenix, Arizona 
                                    07/05 - The Hi Hat, Los Angeles, Califórnia 
                                    08/05 - Constellation Room, Santa Ana, Califórnia 
                                    09/05 - Rickshaw Stop, San Francisco, Califórnia 
                                    11/05 - Chop Suey, Seattle, Washington 
                                    12/05 - Wild Buffalo House of Music, Bellingham, Washington 
                                    13/05 - Rickshaw Theatre, Vancouver, Columbia Britânica 
                                    15/05 - Dante's, Portland, Oregon 
                                    22/05 - Coney Island Baby, Nova Iorque, Nova Iorque 
                                    23/05 - Coney Island Baby, Nova Iorque, Nova Iorque 
                                    25/05 - Black Cat, Washington, DC 
                                    26/05 - Ottobar, Baltimore, Maryland 
                                    28/05 - The Horseshoe Tavern, Toronto, Ontario 
                                    29/05 - Les Foufounes Electriques, Montreal, Quebéc 
                                    31/05 - The Met, Pawtucket, Rhode Island 
                                    01/06 - Baby's All Right, Brooklyn, Nova Iorque 
                                    02/06 - The First Unitarian Church, Filadélfia, Pensilvânia

                                    Além destas datas, a banda ainda faz um aquecimento com 3 outros shows na Califórnia:

                                    20/04 - Ivy Room, Albany, Califórnia
                                    24/04 - The Wayfarer, Costa Mesa, Califórnia
                                    26/04 - Redwood Bar & Grill, Los Angeles, Califórnia
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