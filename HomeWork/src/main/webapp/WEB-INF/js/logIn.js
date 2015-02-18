$(document).ready(function () {
    showLogo();
});
function showLogo(){
      var imgLogoSrc = "../images/TaoBao.PNG";
        $(".logo").append( $("<img>").attr("src",imgLogoSrc));
}
function signInButton(){
    var text1 = "您输入的密码和账户名不匹配，请重新输入。或者您";
    var text2 = "忘记了密码？";

     $(".messageSignIn")
     .append(GetText(text1))
     .append(SetOrangeText(text2))
     .attr("style","border:solid;border-color:red;border-width:1px;width:80%;text-align:left;margin-left:1%;background-color:antiquewhite;padding:2% 0% 2% 0%;font-size:10px")
     ;

}
function GetText(text){
    return  $("<span>").html(text);
}
function SetOrangeText(text){
    return  $("<a>").html(text)
    .attr("href","")
    .attr("style","color:orange;text-decoration:none");
}
