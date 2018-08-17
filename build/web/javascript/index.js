$(document).ready(function() {
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
            
            imgsHTML += `<img class="imagens__todas" id="${imagens[i].caminho_imagem}" src="/Artemanha/assets/imgs/${imagens[i].caminho_imagem}">`
        }
        $('.showcase__background').append(imgsHTML);
    });
});