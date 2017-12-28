<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link href="layui/css/layui.css" rel="stylesheet" />
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
</head>
<body>
	<blockquote class="layui-elem-quote layui-text">添加管理員</blockquote>



	<form id="loginform" name="loginform" method="post"
		action="admin/addDepartment.action">
		<div class="layui-form-item">
			<label class="layui-form-label">部门编号：</label>
			<div class="layui-input-block">
				<input type="text" name="department_key" lay-verify="title"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">部门名称：</label>
			<div class="layui-input-block">
				<input type="text" name="department_value" lay-verify="required"
					placeholder="密码长度为5~15位" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">上级部门的ID：</label>
			<div class="layui-input-block">
				<input type="text" name="parent_departmentkey_id"
					lay-verify="required" placeholder="密码长度为5~15位" autocomplete="off"
					class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">description：</label>
			<div class="layui-input-block">
				<input type="text" name="description" lay-verify="required"
					placeholder="密码长度为5~15位" autocomplete="off" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">create_time：</label>
			<div class="layui-input-block">
				<input type="text" name="create_time" lay-verify="required"
					placeholder="密码长度为5~15位" autocomplete="off" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
			</div>
		</div>
	</form>
	<script>
		layui.use('form', function() {
			var form = layui.form; //获取form模块
			//监听提交
			form.on('submit(loginform)', function(data) {
				layer.msg(1234);

				return false;
			});
		});
	</script>
</body>
</html>