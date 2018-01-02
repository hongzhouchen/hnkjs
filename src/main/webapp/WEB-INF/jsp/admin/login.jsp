<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="publicInfo.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link href="layui/css/layui.css" rel="stylesheet" />
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js"></script>
</head>
<body>

	<form id="loginform" name="loginform" method="post"
		action="admin/addDepartment.action">
		<div class="layui-form-item">
			<label class="layui-form-label">用户名：</label>
			<div class="layui-input-block">
				<input type="text" name="username" lay-verify="title"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码：</label>
			<div class="layui-input-block">
				<input type="text" name="password" lay-verify="required"
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