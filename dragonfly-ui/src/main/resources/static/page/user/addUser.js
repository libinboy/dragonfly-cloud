app.controller('addUserCtrl', ['$scope', '$http', '$state', function($scope, $http, $state) {

    $scope.form = {};

    $scope.return = function () {
        $state.go('app.system.user');
    }

    $scope.submit = function () {
        $http.post('/security/user/create', $scope.form).success(function (response) {
            if (response) {
                $state.go('app.system.user');
            }
        }).error(function (response) {

        });
    }

}]);