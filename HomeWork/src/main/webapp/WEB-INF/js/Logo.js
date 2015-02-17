$(document).ready(function () {
    showLogo();
    showAdd();
    showSignForm();
});
function showLogo(){
      var imgLogoSrc = "../images/TaoBao.PNG";
        $(".logo").append( $("<img>").attr("src",imgLogoSrc));
}
function showAdd(){
      var imgAddSrc = "../images/LogIn/logIn.PNG";
        $(".addImg").append( $("<img>").attr("src",imgAddSrc));
}
