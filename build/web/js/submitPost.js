function Postagem(){
var titulo = getElementById("titulo").value;
var subtitulo = getElementById("subtitulo").value;
var postagem = getElementById("postagem").value;
var imagem = getElementById("imagemdestaque").value;
var hora = Date().getTime();

var home = getElementById("home");

var newdiv = document.createElement("div");
newdiv.className+= "card text-center";
newdiv.appendAfter(home);

var newimg = document.createElement("img");
newimg.className+= "card-img-top";

var newdiv = document.createElement("div");
newdiv.className+= "card-body";

var newtitulo = document.createElement("h5");
newtitulo.className+= "card-title";

var newsubtitulo = document.createElement("p");
newsubtitulo.className+= "card-text";

var newpostagem = document.createElement("p");
newpostagem.className+= "card-text";
   
var newhora = document.createElement("p");
newhora.className+= = "card-text";
var newhora = document.createElement("small");
newhora.className+= "text-muted";

var newseparador = document.createElement("hr");

    
    
}