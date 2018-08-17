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
                    <div class="banda">
                        <div class ="headname">
                        <h3 id="home">História do Green Day</h3>
                        </div>
                            <div class="card text-center">
                                <img class="card-img-top" src="${pageContext.request.contextPath}/img/gilman-924.jpg" alt="Card image cap">
                                <div class="card-body">
                                  <h5 class="card-title">Green Day @ 924 Gilman Street, Berkeley CA</h5>
                                  <p class="card-text">
                                    Green Day é uma banda de punk rock dos Estados Unidos formada em 1986 em Berkeley, Califórnia. A banda é composta por 3 membros: Billie Joe Armstrong (guitarra e vocais), Mike Dirnt (baixo e vocais) e Tré Cool (bateria). A banda foi formada no início de 1987 com o nome de Sweet Children, com o baterista Al Sobrante. Em 1989, a banda mudou para o nome atual, logo após lançou o seu primeiro álbum de estúdio 39/Smooth.

                                    Foi um dos grupos que nasceram no clube 924 Gilman Street, lugar frequentado por bandas de punk rock. Suas primeiras publicações foram feitas pela gravadora Lookout! Records, graças às vendas de sucesso de seus primeiros álbuns, obteve-se um número significativo de fãs. Alguns anos mais tarde, em 1994, o grupo assinou com a Reprise Records, esta gravadora lançou o aclamado Dookie, o novo álbum do grupo levou o som do final dos anos 1990 para a nova geração, além disso, o álbum se tornou um sucesso internacional e já vendeu mais de 20 milhões de cópias em todo o mundo.

                                    O Green Day junto com outras bandas como Sublime, The Offspring e Rancid, foram as que produziram o renascimento e popularização de grande interesse do punk rock nos Estados Unidos, e da própria cultura.

                                    A banda já vendeu cerca de 85 milhões de cópias em todo o mundo e 25 milhões só nos Estados Unidos.[1] Em 2010 estreou uma adaptação musical do álbum American Idiot, na Broadway, o musical foi indicado ao Tony Awards, incluindo Melhor Musical, vencendo dois e recebeu críticas positivas. Em meados de 2011 a revista Kerrang!, nomeou o Green Day como a segunda banda mais influênte dos últimos 30 anos, atrás apenas de Metallica.[2] Ficaram em 91° na lista dos "100 Maiores Artistas de Todos os Tempos" do canal de televisão VH1.[3] Em 2014 foram introduzidos para o Rock and Roll Hall of Fame 2015.[4]

                                    O grupo ganhou cinco Grammy: Melhor Álbum Alternativo para Dookie, Melhor Álbum de Rock para American Idiot, Gravação do Ano para Boulevard of Broken Dreams, pela segunda vez Melhor Álbum de Rock para 21st Century Breakdown e Melhor Álbum de Show Musical para a versão teatro musical de American Idiot (musical).
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