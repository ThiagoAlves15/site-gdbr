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
                        <h3 id="home">Tré Cool</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/tre-cool.png" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Tré Cool @ MTV EMA, 2012</h5>
                                  <p class="card-text">
                                    Frank Edwin Wright III (Frankfurt, 9 de Dezembro de 1972), conhecido pelo nome artístico de Tré Cool, é um músico americano nascido na Alemanha. Ele é o atual baterista da banda de punk rock Green Day. Ele se juntou logo à banda após o baterista original, e seu aluno de bateria, Al Sobrante, sair para completar os estudos. Ele também sabe tocar guitarra e acordeão.
                                    Tré nasceu na Alemanha, mas cresceu em Willits, Califórnia, Estados Unidos, e viveu com seu pai e dois irmãos mais velhos, nas montanhas de Mendocino. Seu pai, um veterano aposentado da guerra do Vietnã, construiu muitas das casas naquela área, incluindo a de Lawrence Livermore, o seu vizinho mais próximo e também o fundador da Lookout! Records. Ele também deu a Tré seu apelido.
                                    Tré desistiu da escola e nunca terminou o colegial. Em vez disso, ele fez um teste de equivalência e começou tendo aulas em uma escola de comunidade. Mas ao passo que Green Day se intensificava, foi obrigado a desistir da escola.
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