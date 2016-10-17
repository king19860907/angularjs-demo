"use strict"
app.config(["$stateProvider","$urlRouterProvider",routeFn]);
function routeFn($stateProvider,$urlRouterProvider){
    $urlRouterProvider.otherwise("/");
    $stateProvider
        .state("table",{
            url:"/table",
            templateUrl:"/table/table-inner.html",
            controller:"tableController",
            controllerAs:"table",
            resolve:{
                deps:["$ocLazyLoad",function($ocLazyLoad){
                    return $ocLazyLoad.load("/js/table/table.js");
                }]
            }
        })
};