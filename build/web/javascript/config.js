// fix git: find .git/objects/ -size 0 -exec rm -f {} \;
function uploadDeFoto(){
  alert('Upload!');
  return false;
}

function alterarDadosHome(){
  alert('Dados!');
  return false;
}

function procurarPorFoto(){
  alert('Procurar!');
  return false;
}

function deletarImagem(selecao){
  $.ajax({
    'url': '/Artemanha/deleta-imagem',
    'method': 'POST',
    'data': {
        'id': selecao
    }
  }).done(function(data) {
    alert('Imagem deletada!');
    location.href = '/Artemanha/config';
  });
}

function mascara(o,f){
  v_obj=o;
  v_fun=f;
  setTimeout("execmascara()",1);
}

function execmascara(){
  v_obj.value=v_fun(v_obj.value);
}

function mtel(v){
  v=v.replace(/\D/g,''); //Remove tudo o que não é dígito
  v=v.replace(/^(\d{2})(\d)/g,"($1) $2"); //Coloca parênteses em volta dos dois primeiros dígitos
  v=v.replace(/(\d)(\d{4})$/,"$1-$2"); //Coloca hífen entre o quarto e o quinto dígitos
  return v;
}

function id( el ){
  return document.getElementById( el );
}

window.onload = function(){
  id("whats").onkeyup = function(){
    mascara( this, mtel );
  };
  
  $('.datepicker').datepicker({
    format: "dd/mm/yyyy",
    maxViewMode: 2,
    todayBtn: "linked",
    language: "pt-BR",
    orientation: "bottom auto",
    todayHighlight: true
  });
  
  $.ajax({
    'url': '/Artemanha/imagens-parente',
    'method': 'GET',
  }).done(function(data) {
    let imgsHTML = "";
    let imagens = data.imagens;
    console.log(imagens);
    for (let i = 0, size = imagens.length; i < size; i++) {
        if (!imagens[i]) { continue; }
        console.log(imagens[i]);
        imgsHTML += `
          <img class="imagens__todas" id="${imagens[i].caminho_imagem}" src="/Artemanha/assets/imgs/${imagens[i].caminho_imagem}" onclick="deletarImagem(${imagens[i].id})">
        `
    }
    $('.showcase__background').append(imgsHTML);
  });
};
