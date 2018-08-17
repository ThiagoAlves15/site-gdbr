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
            
            imgsHTML += `<img class="postagens__todas" id="${postagens[i].caminho_imagem_postagem}" src="/GDBR/assets/imgs/${postagens[i].caminho_imagem_postagem}">`
        }
        $('.showcase__background').append(imgsHTML);
    });
});