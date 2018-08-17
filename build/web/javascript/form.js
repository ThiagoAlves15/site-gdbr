function Contato(name, email, tel, cel, mensa) {
  this.name = name.toString();
  this.email = email.toString();
  this.tel = tel.toString();
  this.cel = cel.toString();
  this.mensa = mensa.toString();
  
  this.getName = function() {
    return this.name;
  };

  this.getEmail = function() {
    return this.email;
  };
  
  this.getTel = function() {
    return this.tel;
  };

  this.getCel = function() {
    return this.cel;
  };
  
  this.getMensa = function() {
    return this.mensa;
  };
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

function send_data(){
  var name = document.getElementById("name").value;
  var email = document.getElementById("email").value;
  var telefone = document.getElementById("telefone").value;
  var celular = document.getElementById("celular").value;
  var mensa = document.getElementById("mensagem").value;
  
  if ((name) && (mensa) && (email || telefone || celular)){
    var contato = new Contato(name, email, telefone, celular, mensa);
    alert (`Enviado os dados com sucesso!\nNome: ${contato.getName()}\nEmail: ${contato.getEmail()}\nTel: ${contato.getTel()}\nCel: ${contato.getCel()}\nObservação: ${contato.getMensa()}`);
    window.location = "index.jsp"; // Redirecting to other page.
    return false;
  }
  else{
    //$('form').submit(function (evt) {
     // evt.preventDefault(); //prevents the default action
    //});
    alert ("Pelo menos um campo de contato deve ser preenchido!");
    return false;
  }
}

window.onload = function(){
  id("telefone").onkeyup = function(){
    mascara( this, mtel );
  };
  id("celular").onkeyup = function(){
    mascara( this, mtel );
  };
};
