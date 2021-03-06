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
                    <div class="mike-dirnt">
                        <div class ="headname">
                        <h3 id="home">Mike Dirnt</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/mike-dirnt_1.png" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Mike Dirnt @ Rock in Park, Nuremberga DE</h5>
                                  <p class="card-text">
                                    Michael Ryan Pritchard, conhecido como Mike Dirnt, (Rodeo, Califórnia, 4 de maio de 1972) é o baixista da banda de punk rock Green Day. O seu apelido fictício (Dirnt) deve-se ao fato de que estava aprendendo a tocar baixo e, no colégio, ficava repetindo notas no baixo que soavam como onomatopéia em inglês (dirnt, dirnt, dirnt), e ele adotou a brincadeira para o seu 'sobrenome'
                                    Dirnt nasceu na cidade de Rodeo, Califórnia, em 4 de maio de 1972. Quando nasceu, sua mãe que usava heroína o deixou para adoção. Ele foi adotado e seus pais, Patrick Pritchard e Cheryl Nasser, explicaram para ele desde cedo que era adotado. Ele tem uma meia irmã, chamada Myla, que saiu de casa aos 13 anos.
                                    Logo após completar seis anos, seus pais adotivos se divorciaram e Mike acabou ficando um tempo com o seu pai, um programador analista de sistemas próspero e a nova mulher dele, mas logo depois passou a morar com a mãe. Esta que acabou se casando novamente. "Quando eu tinha quatorze ou quinze anos, minha mãe passou a noite inteira fora, voltando pra casa no dia seguinte com um cara e ele passou a morar conosco. Eu nunca o havia visto antes e, de repente, ele virou meu padrasto", disse Mike numa entrevista. Mike começou a tocar guitarra pouco tempo depois do divórcio dos seus pais adotivos e conheceu Billie Joe Armstrong na Carquinez Middle School. O interesse pela música uniu ambos. Armstrong começou a ensinar Mike a tocar banjo e eles passaram muito tempo se dedicando a aprender músicas de bandas como Kiss, Motley Crue e Van Halen. Eles formaram um grupo com outros dois colegas: Raj Punjabi na bateria e Jason Relva no baixo. Billie Joe tocava os solos e Mike a base. Mais tarde, Dirnt começou a tocar baixo.
                                    Mike começou a trabalhar em um restaurante chamado Nantucket quando sua família passou a enfrentar problemas financeiros. Tendo conseguido juntar algum dinheiro, ele comprou uma caminhonete usada com a qual frequentemente dirigia com Billie até Berkeley para assistir a shows no 924 Gilman Street, um influente clube punk.
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