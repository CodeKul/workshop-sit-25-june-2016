/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * */

var app = angular.module("myApp",[]);

app.controller("dataBindController",function ($scope){
    $scope.openAlert = function (){
      
        alert("Mobile - "+$scope.inputMobile);
    };
});

app.controller("listController",function ($scope){
    
    $scope.countries = [
        "India",
        "China",
        "Japan",
        "Shri Lanka",
        "Nepal"
    ];
})

