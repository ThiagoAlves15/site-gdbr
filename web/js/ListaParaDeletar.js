function deletarPostagem(id){
  $.ajax({
    'url': '/GDBR/deleta-postagem',
    'method': 'POST',
    'data': {
        'id': id
    }
  }).done(function(data) {
    alert('Postagem deletada!');
    location.href = '/GDBR/admin';
  });
}

$(document).ready(function() {
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
                <div class="card text-center">
                    <div class="card-body">
                        <img class="card-img-top" id="${postagens[i].caminho_imagem_postagem}" src="GDBR/img/${postagens[i].caminho_imagem_postagem}">
                        <h5 class="card-title">${postagens[i].titulo_postagem}.</h5>
                        <p class="card-text">${postagens[i].texto_postagem} </p>
                        <p class="card-text">Data da postagem: ${postagens[i].criado_em_postagem} </p>
                        <a type="button" class="btn btn-success" onclick="deletarPostagem(${postagens[i].id})">Deletar</a>
                    <hr>
                    </div>
                </div>
            `
        }
        $('.postagens__showcase').append(imgsHTML);
    });
});
