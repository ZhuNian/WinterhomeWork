function addToCartButton(name) {
    return $("<button>")
        .html("加入购物车")
        .click(function () {
            addToCart(name);
        }).attr("class","addToCart");
}

function addToCart(name) {

}

function goToCart() {

}
