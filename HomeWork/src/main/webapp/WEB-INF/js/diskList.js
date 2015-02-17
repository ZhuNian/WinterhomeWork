$(document).ready(function () {
    dataToView(disks);
});

function dataToView(disks) {
    $("#disks").empty();
    var diskDivs = _.map(disks, function (disk) {
        return diskDiv(disk);
    });
    _.each(diskDivs, function (div) {
        $("#disks").append(div);
    });
}

function diskDiv(disk) {
    return $("<div>")
        .attr("class", "item")
 //       .append(diskName(disk.name))
        .append(diskImgUrl(disk.img))
        .append(diskPrice(disk.price))
        .append(addPostPrice(disk.postPrice))
        .append(diskDesc(disk.desc))
//        .append(removeButton(disk.name))
        .append(addToCartButton(disk.name));
}

function addPostPrice(postPrice) {
    return $("<p>").html(postPrice).attr("class","postPrice");
}

function diskName(title) {
    return $("<p>").html(title);
}
function diskPrice(price) {
    return $("<p >").html(price).attr("class", "price");
}
function diskImgUrl(img) {
    return $("<img>").attr("src", img);
}

function diskDesc(desc) {
    return $("<p>").html(desc).attr("class", "desc");
}

function removeButton(name) {
    return $("<button>")
        .html("remove")
        .click(function () {
            remove(name);
        });
}

function remove(name) {
    disks = _.filter(disks, function (disk) {
        return disk.name !== name;
    });

    dataToView(disks);
}

function add() {
    var newProduct = {
        name: $("#name").val(),
        img: $("#imgUrl").val(),
        desc: $("#desc").val()
    };

    disks.push(newProduct);

    dataToView(disks);
}

function search() {
    var keyWord = $("#search").val();
    var searchResult = _.filter(disks, function (disk) {
        return disk.name.indexOf(keyWord) != -1;
    });
    dataToView(searchResult);
}
