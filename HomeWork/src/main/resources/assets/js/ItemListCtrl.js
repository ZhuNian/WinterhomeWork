function ItemListCtrl($scope) {
    $scope.init = function () {
        listItems();
    };

    function listItems() {
        $.ajax({
            url: "/disks/list",
            type: "GET"
        }).done(function (disks) {
            $scope.itemsList = disks;
        });
    }

    $scope.add = function () {
        $.ajax({
            url: "/disks/add",
            type: "POST",
            data: JSON.stringify($scope.itemsList),
            contentType: "application/json",
            success: function (disk) {
                listItems();
            }
        })
    }

}