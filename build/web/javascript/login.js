var TENTATIVAS = 3; // Variable to count number of attempts.
// Below function Executes on click of login button.
function validate(){
  var login = document.getElementById("login").value;
  var senha = document.getElementById("senha").value;
  
  if ((login === "DonaMaria") && (senha === "sitedadonamaria")){
    alert ("Logado com sucesso!");
    //window.location = "dynamic/jsp/config.jsp"; // Redirecting to other page.
    return true;
  } else {
    TENTATIVAS --;// Decrementing by one.
    if (TENTATIVAS >= 2){
      alert(`Restam ${TENTATIVAS} tentativas!`);
    } else if (TENTATIVAS === 1){
      alert(`Resta ${TENTATIVAS} tentativa!`);
    } else{
      alert(`Desativando!`);
    }
    
    // Disabling fields after 3 attempts.
    if( TENTATIVAS === 0){
      document.getElementById("login").disabled = true;
      document.getElementById("senha").disabled = true;
      document.getElementById("logar").disabled = true;
    }
    return false;
  }
}
