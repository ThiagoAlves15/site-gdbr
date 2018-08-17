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

function deletarPostagem(selecao){
  $.ajax({
    'url': '/GDBR/deleta-postagem',
    'method': 'POST',
    'data': {
        'id': selecao
    }
  }).done(function(data) {
    alert('Postagem deletada!');
    location.href = '/GDBR/config';
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
 
  $('.datepicker').datepicker({
    format: "dd/mm/yyyy",
    maxViewMode: 2,
    todayBtn: "linked",
    language: "pt-BR",
    orientation: "bottom auto",
    todayHighlight: true
  });
  
  $.ajax({
    'url': '/GDBR/postagens',
    'method': 'GET',
  }).done(function(data) {
    let imgsHTML = "";
    let postagens = data.postagens;
    console.log(postagens);
    for (let i = 0, size = postagens.length; i < size; i++) {
        if (!postagens[i]) { continue; }
        console.log(postagens[i]);
        imgsHTML += `
          <img class="postagens__todas" id="${postagens[i].caminho_imagem_postagem}" src="/GDBR/assets/imgs/${postagens[i].caminho_imagem_postagem}" onclick="deletarPostagem(${postagens[i].id})">
        `
    }
    $('.showcase__background').append(imgsHTML);
  });
};
