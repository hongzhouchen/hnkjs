<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link href="css/admin/userManager.css" rel="stylesheet">
</head>
<body>
	<blockquote class="layui-elem-quote layui-quote-nm ">
		<p style="color:#FF5722">注意： 添加系统管理员不能是傻x.....</p>
	</blockquote>
	<div class="layui-row">
		<div class="layui-col-md12">
			<div class="layui-btn-group managerActionLine">
				<button class="layui-btn layui-btn-radius" data-type="addManager">添加管理员</button>
			</div>
			<table id="managerList" lay-filter="managerList"></table>
		</div>
	</div>

	<script type="text/html" id="action">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
	<script>
		layui.use(['table','layer'], function() {
			var table = layui.table;
			var layer=layui.layer;
			var openWin;
			var $ = layui.jquery, active = {
				//添加管理员
				addManager : function() {
					layer.open({
						type : 2,
						title : '添加管理员',
						shadeClose : false,//是否关闭遮罩层
						shade : 0.3, //遮罩层透明度
						//offset: ['100px'], //自定义位置*/
						area : ['600px','330px' ],
						content : 'admin/addManagerPage.action' //iframe的url
					});
				}
			};
			//第一个实例
			table.render({
				elem : '#managerList',
				height : 'full',
				url : 'admin/managerList.action' //数据接口
                ,page : true //开启分页
				,cols : [ [ //表头
				{
					checkbox : true,
					fixed : true
				}, {
					field : 'id',
					title : 'ID',
					algin : 'center',
					width : 80,
					align : 'center',
				}, {
					field : 'user_name',
					title : '用户名',
					align : 'center',
				}, {
					field : 'user_head',
					title : '头像地址',
					align : 'center',
				}, {
					field : 'islogin',
					title : '是否登录',
					align : 'center',
				}, {
					field : 'last_logintime',
					title : '上次登录时间',
				}, {
					field : 'logincount',
					title : '登录次数',
					align : 'center',
					sort : true
				}, {
					field : 'action',
					title : '操作',
					fixed : 'right',
					align : 'center',
					toolbar : '#action'
				} ] ]
			});
			//监听工具条
			table.on('tool(managerList)', function(obj) {
				var data = obj.data;
				if (obj.event === 'del') {
					layer.confirm('确定要删除该部门吗？', function(index) {
						//调用后台执行删除
						$.get("admin/deleteDepartment.action", function(res) {
							var dataobj = eval('(' + res + ')');
							if (dataobj.code == 1) {
								layer.alert(dataobj.result);
								obj.del();
							} else {
								layer.alert(dataobj.result);
							}
						})
						layer.close(index);
					});
				} else if (obj.event === 'edit') {
					layer.alert('编辑行：<br>' + JSON.stringify(data))
				}
			});

			$('.managerActionLine .layui-btn').on('click', function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});
		});
	</script>



</body>
</html>