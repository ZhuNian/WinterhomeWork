$(document).ready(function () {
    showLogo();
});
function showLogo(){
      var imgLogoSrc = "../images/TaoBao.PNG";
        $(".logo").append( $("<img>").attr("src",imgLogoSrc));
}
function clickButton(){
    $(".messageBox").append( $("<div>")
    .html("用户名已存在，请换一个奇葩的名字试试！"))
    .attr("style","border:solid;border-color:red;border-width:1px;width:40%;text-align:center;margin-left:60%;background-color:antiquewhite;padding:2% 0% 2% 0%;font-size:10px")
    ;
}