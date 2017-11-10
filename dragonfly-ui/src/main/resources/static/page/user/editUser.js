app.controller('editUserCtrl', ['$scope', '$http', '$state', function($scope, $http, $state) {

    $scope.return = function() {
        $state.go('app.system.user');
    }

}]);