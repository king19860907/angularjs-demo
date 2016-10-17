app.controller('tableController', function($scope,$http) {

    $http.get("/api/user.htm")
        .success(function (response) {

            $scope.users = response;

        });

})