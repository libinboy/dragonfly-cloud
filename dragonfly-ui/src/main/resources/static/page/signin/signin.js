'use strict';

/* Controllers */
// signin controller
app.controller('SigninController', ['$scope', '$http', '$state', function($scope, $http, $state) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
      $scope.authError = null;
      // Try to login
      $http.post('/security/access', $scope.user).success(function (response) {
          $state.go('app.dashboard');
      }).error(function (response) {
          $scope.authError = response.message;
      });
    };
  }])
;