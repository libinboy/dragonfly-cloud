app.controller('addUserCtrl', ['$scope', '$http', '$state', function($scope, $http, $state) {

    $scope.return = function() {
        $state.go('app.user.page');
    }

}]);