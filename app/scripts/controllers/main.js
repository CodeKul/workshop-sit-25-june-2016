'use strict';

/**
 * @ngdoc function
 * @name sitfrontApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the sitfrontApp
 */
angular.module('sitfrontApp')
        .controller('MainCtrl', function ($http) {

            var me = this;

            me.hitWebCall = function () {

                console.log("User Name" + me.userName);
                console.log("Password" + me.password);
                
                $http({
                    method: 'POST',
                    url: 'http://localhost:8080/login',
                    data: {
                        userName: me.userName,
                        password: me.password
                    }
                }).then(function (response) {

                    me.status = response.data.status;
                    console.log("Success" + response.data.status);

                }, function (response) {
                    console.log("Fail" + response);
                    me.status = response.data.status;
                });
            };
        });
