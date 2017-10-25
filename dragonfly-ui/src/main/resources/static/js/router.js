'use strict';

/**
 * Config for the router
 */
angular.module('app')
  .run (
    ['$rootScope', '$state', '$stateParams', function ($rootScope, $state, $stateParams) {
          $rootScope.$state = $state;
          $rootScope.$stateParams = $stateParams;        
      }
    ]
  )
  .config(
    ['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider.otherwise('/access/signin');

        $stateProvider
          .state('app', {
              abstract: true,
              url: '/app',
              templateUrl: 'page/main/main.html'
          })
          .state('app.dashboard', {
              url: '/dashboard',
              templateUrl: 'page/dashboard/dashboard.html',
              resolve: {
                deps: ['$ocLazyLoad',
                  function( $ocLazyLoad ){
                    return $ocLazyLoad.load(['page/dashboard/dashboard.js']);
                }]
              }
          })

          // user
          .state('app.system', {
              url: '/system',
              template: '<div ui-view class="fade-in-down"></div>'
          })
          .state('app.system.user', {
              url: '/user',
              templateUrl: 'page/user/listUser.html',
			  resolve: {
				deps: ['$ocLazyLoad',
                    function( $ocLazyLoad ){
                        return $ocLazyLoad.load('ngGrid').then(
                            function(){
                                return $ocLazyLoad.load('page/user/listUser.js');
                            }
						);
					}
				]
			  }
          })

          // access login
          .state('access', {
              url: '/access',
              template: '<div ui-view class="fade-in-right-big smooth"></div>'
          })
          .state('access.signin', {
              url: '/signin',
              templateUrl: 'page/signin/signin.html',
              resolve: {
                  deps: ['uiLoad',
                    function( uiLoad ){
                      return uiLoad.load( ['page/signin/signin.js'] );
                  }]
              }
          });
      }
    ]
  )
;