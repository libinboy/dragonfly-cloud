'use strict';
/* Controllers */
// signin controller
app.controller('SigninController', ['$scope', '$http', '$state', '$localStorage', function($scope, $http, $state, $localStorage) {

    $scope.user = {};

    $scope.authError = null;

    $scope.login = function() {
      $scope.authError = null;
      // Try to login
      $http.post('/security/access', $scope.user).success(function (response) {
          if (response.status == 200) {
              $scope.session_user = $localStorage.user = response.result;
              $state.go('app.dashboard');
          } else {
              $scope.authError = response.message;
          }
      }).error(function (response) {
          $scope.authError = response.message;
      });
    };

}]);