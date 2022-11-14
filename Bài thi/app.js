var app = angular.module("myApp", []);

app.controller("myCtrl", function ($scope) {
    console.log("My controller.....");

    $scope.users = [
        {name: "Product One", email: "$123.3", fullname: ""},
        {name: "Product Two", email: "$29.7", fullname: "" },
        {name: "Product Three", email: "$156.8", fullname: "" },

    ];

    $scope.addUser = function () {
        $scope.users.push($scope.newUser);
        $scope.newUser = {};
        $scope.message = "New User Added successfully";
    };
    $scope.selectUser = function (user) {
        console.log(user);
        $scope.clickedUser = user;
    };
    $scope.editUser = function () {
        $scope.message = "User Edited successfully";
    };

    $scope.deleteUser = function () {
        $scope.users.slice($scope.users.index0f($scope.clickedUser));
        $scope.message = "User Deleted successfully";
    };
    $scope.clearMessage = function () {
        $scope.message = "";
    };
});