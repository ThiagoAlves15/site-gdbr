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
            <div class="row">
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
                    <div class="postsprincipais bg-alt">
                        <h3 id="home">Tour</h3>
                        <hr>
                         
                        <table class="wikitable plainrowheaders" style="text-align:center;">
                            <th colspan="7">Latin America<sup id="cite_ref-129" class="reference"></sup></th>
                            <tr>
                            <th scope="col" style="width:13em;">Date</th>
                            <th scope="col" style="width:15em;">City</th>
                            <th scope="col" style="width:10em;">Country</th>
                            <th scope="col" style="width:18em;">Venue</th>
                            <th scope="col" style="width:10em;">Attendance</th>
                            <th scope="col" style="width:10em;">Revenue</th>
                            <th scope="col">Ref.</th>
                            </tr>
                            <tr>
                            <td>November 1, 2017</td>
                            <td>Rio de Janeiro</td>
                            <td rowspan="4">Brazil</td>
                            <td>Jeunesse Arena</td>
                            <td>8,194&nbsp;/ 11,000</td>
                            <td>$543,317</td>
                            <td><sup id="cite_ref-130" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 3, 2017</td>
                            <td>São Paulo</td>
                            <td>Arena Anhembi</td>
                            <td>22,643&nbsp;/ 29,000</td>
                            <td>$1,659,260</td>
                            <td><sup id="cite_ref-131" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 5, 2017</td>
                            <td>Curitiba</td>
                            <td>Pedreira Paulo Leminski</td>
                            <td>12,205&nbsp;/ 16,000</td>
                            <td>$972,917</td>
                            <td><sup id="cite_ref-132" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 7, 2017</td>
                            <td>Porto Alegre</td>
                            <td>Estádio Beira-Rio</td>
                            <td>14,000&nbsp;/ 15,400</td>
                            <td>$836,175</td>
                            <td><sup id="cite_ref-133" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 10, 2017</td>
                            <td>Buenos Aires</td>
                            <td>Argentina</td>
                            <td>José Amalfitani Stadium</td>
                            <td>33,123&nbsp;/ 37,600</td>
                            <td>$2,209,690</td>
                            <td><sup id="cite_ref-134" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 12, 2017</td>
                            <td>Santiago</td>
                            <td>Chile</td>
                            <td>Estadio Bicentenario de La Florida</td>
                            <td>—</td>
                            <td>—</td>
                            <td><sup id="cite_ref-135" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 14, 2017</td>
                            <td>Lima</td>
                            <td>Peru</td>
                            <td>Estadio Universidad San Marcos</td>
                            <td>15,457&nbsp;/ 20,000</td>
                            <td>$915,910</td>
                            <td><sup id="cite_ref-136" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 17, 2017</td>
                            <td>Bogotá</td>
                            <td>Colombia</td>
                            <td>Simón Bolívar Park</td>
                            <td>9,165&nbsp;/ 12,000</td>
                            <td>$789,642</td>
                            <td><sup id="cite_ref-137" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <td>November 19, 2017</td>
                            <td>Mexico City</td>
                            <td>Mexico</td>
                            <td>Autódromo Hermanos Rodríguez<sup id="cite_ref-138" class="reference"></sup></td>
                            <td data-sort-value="" style="background: #ececec; color: #2C2C2C; vertical-align: middle; font-size: smaller; text-align: center;" class="table-na">N/A</td>
                            <td data-sort-value="" style="background: #ececec; color: #2C2C2C; vertical-align: middle; font-size: smaller; text-align: center;" class="table-na">N/A</td>
                            <td><sup id="cite_ref-139" class="reference"></sup></td>
                            </tr>
                            <tr>
                            <th colspan="4" style="text-align:center">Totals</th>
                            <th>803,936&nbsp;/ 978,938</th>
                            <th>$46,130,728</th>
                            <th>–</th>
                            </tr>
                            </tbody></table>
                        <hr>
                        <h2<a title="Fonte da Tabela" href="">Fonte: Wikipédia</a></h2>
                    </div>
                </div>
            </div>
            <hr>
        
        </div>