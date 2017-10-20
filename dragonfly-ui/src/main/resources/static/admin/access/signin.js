'use strict';

/* Controllers */
  // signin controller
app.controller('SigninFormController', ['$scope', '$http', '$state', function($scope, $http, $state) {
    $scope.user = {};
    $scope.authError = null;
    $scope.login = function() {
      $scope.authError = null;
      // Try to login
      $http.post('/system/access', {email: $scope.user.email, password: $scope.user.password})
      .success(function (response) {
          debugger
          $state.go('app.dashboard');
      }).error(function (response) {
          debugger
          $scope.authError = 'Server Error';
      });
      /*.then(function(response) {
        if ( !response.data.user ) {
          $scope.authError = 'Email or Password not right';
        }else{
          $state.go('app.dashboard');
        }
      }, function() {
        $scope.authError = 'Server Error';
      });*/
    };
  }])
;