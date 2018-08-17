/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function VisualizarPost() {
    var para = document.createElement("h2");
    var paraa = document.createElement("h4");
    var parab = document.createElement("p");
    
    var titulo = document.getElementById("titulo").value;
    var t = document.createTextNode(titulo);
    
    var subtitulo = document.getElementById("subtitulo").value;
    var sb = document.createTextNode(subtitulo);
    
    var subtitulo = document.getElementById("postagem").value;
    var post = document.createTextNode(subtitulo);
    
    var path = document.getElementById("imagemdestaque").value;
    var img = document.createElement("img");
    img.src = path;
    
    var div = document.getElementById("visualizar-post");
    
    para.appendChild(post);
    div.appendChild(img);
    
    para.appendChild(t);
    div.appendChild(para);
    
    paraa.appendChild(sb);
    div.appendChild(paraa);
    
    parab.appendChild(post);
    div.appendChild(parab);
}