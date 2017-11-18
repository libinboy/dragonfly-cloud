app.controller('listUserCtrl', ['$scope', '$http', function($scope, $http) {

    $scope.form = {};

    $scope.form.pager = {};

    $scope.user = {
        baseUrl: "/security/user",
        toolbarId: "toolbar",
        unique: "userId",
        order: "asc",
        currentItem: {}
    };

    $scope.user.columns = function () {
        return [{
            checkbox: true
        }, {
            field: 'account',
            title: '账号',
        }, {
            field: 'password',
            title: '密码'
        }, {
            field: 'userName',
            title: '用户名'
        }, {
            field: 'operate',
            title: '操作',
            align: 'center',
            formatter: $scope.operateFormatter
        }];
    };

    $scope.operateFormatter = function(value, row, index) {
        return [
            '<button type="button" class="btn btn-default btn-sm">编辑</button>'
        ].join('');
    };

    $scope.user.queryParams = function (params) {
        if (!params)
            return $scope.form;

        $scope.form.pager.pageNumber = (params.offset / params.limit) + 1; //当前页数
        $scope.form.pager.pageSize = params.limit; //页面大小
        return $scope.form;
    };
	
	$scope.initTable = function () {
		$scope.bsTableControl =  {
			options : {
				url: $scope.user.baseUrl + '/page', //请求后台的URL（*）
				method: 'post', //请求方式（*）
				toolbar: '#' + $scope.user.toolbarId, //工具按钮用哪个容器
				striped: true, //是否显示行间隔色
				cache: false, //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
				pagination: true, //是否显示分页（*）
				sortable: false, //是否启用排序
				sortOrder: $scope.user.order, //排序方式
				queryParams: $scope.user.queryParams,//传递参数（*）
				sidePagination: "server", //分页方式：client客户端分页，server服务端分页（*）
				pageNumber: 1, //初始化加载第一页，默认第一页
				pageSize: 10, //每页的记录行数（*）
				pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
				search: false, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
				strictSearch: false,
				showColumns: false, //是否显示所有的列
				showRefresh: true, //是否显示刷新按钮
				minimumCountColumns: 2, //最少允许的列数
				clickToSelect: true, //是否启用点击选中行
				uniqueId: $scope.user.unique, //每一行的唯一标识，一般为主键列
				showToggle: true, //是否显示详细视图和列表视图的切换按钮
				cardView: false, //是否显示详细视图
				detailView: false, //是否显示父子表
				locale: 'zh-CN',
				columns: $scope.user.columns()
			}
		};
	};    

    $scope.submit = function () {
        $scope.initTable();
    };

    //Select the workspace in document ready event
    $(document).ready(function () {
        $scope.initTable();
    });
}]);