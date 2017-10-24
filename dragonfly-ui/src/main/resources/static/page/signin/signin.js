'use strict';

/* Controllers */
// signin controller
app.controller('SigninController', ['$scope', '$http', '$state', function($scope, $http, $state) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
      $scope.authError = null;
      // Try to login
      $http.post('/security/access', {email: $scope.user.email, password: $scope.user.password})
      .success(function (response) {
          debugger
          $state.go('app.dashboard');
      }).error(function (response) {
          debugger
          $scope.authError = 'Server Error';
      });
    };
  }])
;