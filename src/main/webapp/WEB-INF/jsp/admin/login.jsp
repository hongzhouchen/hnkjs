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
<link rel="stylesheet" href="css/admin/login-base.css">
<link rel="stylesheet" href="css/admin/login-style.css">
</head>
<body>

	<div class="bg"></div>
	<div class="container">
		<div class="line bouncein">
			<div class="xs6 xm4 xs3-move xm4-move">
				<div style="height: 150px;"></div>
				<div class="media media-y margin-big-bottom"></div>
				<form action="index.html" method="post">
					<div class="panel loginbox">
						<div class="text-center margin-big padding-big-top">
							<h1>后台登录</h1>
						</div>
						<div class="panel-body"
							style="padding: 30px; padding-bottom: 10px; padding-top: 10px;">
							<div class="form-group">
								<div class="field field-icon-right">
									<input type="text" class="input input-big" name="name"
										id="username" placeholder="登录账号" /> <span
										class="icon icon-user margin-small"></span>
								</div>
							</div>
							<div class="form-group">
								<div class="field field-icon-right">
									<input type="password" class="input input-big" name="password"
										id="password" placeholder="登录密码" /> <span
										class="icon icon-key margin-small"></span>
								</div>
							</div>
							<div class="form-group">
								<div class="field">
									<input type="text" class="input input-big" name="code"
										placeholder="填写右侧的验证码" /> <img src="img/login/passcode.jpg"
										alt="" width="100" height="32" class="passcode"
										style="height: 43px; cursor: pointer;"
										onClick="this.src=this.src+'?'">
								</div>
							</div>
						</div>
						<div style="padding: 30px;">
							<input type="button" id="button"
								class="button button-block bg-main text-big input-big"
								value="登录">
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>












	<!-- <form id="loginform" name="loginform" method="post"
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
	</script> -->
</body>
</html>