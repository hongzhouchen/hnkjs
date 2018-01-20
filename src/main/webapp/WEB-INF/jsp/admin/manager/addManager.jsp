<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<div class="layui-container">
	
		<div class="layui-row" style="margin-buttom:15px;">
			<form class="layui-form" action="admin/addManager.action" id="addManagerForm" name="addManagerForm">
				<!--用户名  -->
				<div class="layui-form-item">
					<label class="layui-form-label">用户名:</label>
					<div class="layui-input-block">
						<input type="text" name="user_name" lay-verify="required"
							autocomplete="off" placeholder="您在系统的名称" class="layui-input">
					</div>
				</div>
				<!--登录名  -->
				<div class="layui-form-item">
					<label class="layui-form-label">登录名:</label>
					<div class="layui-input-block">
						<input type="text" name="login_account" lay-verify="required"
							autocomplete="off" placeholder="用于登录的账号" class="layui-input">
					</div>
				</div>
				<!--密码 -->
				<div class="layui-form-item">
					<label class="layui-form-label">密码：</label>
					<div class="layui-input-block">
						<input type="password" name="login_pass" lay-verify="required"
							placeholder="密码长度为5~15位,默认密码为 888888" autocomplete="off"
							class="layui-input" value="888888">
					</div>
				</div>
				<!--部门-->
				<div class="layui-form-item">
					<label class="layui-form-label">部门设置</label>
					<div class="layui-input-block">
						<select name="department_id" id="department_id"
							lay-verify="required">
							<option value=""></option>
							<c:forEach var="item" items="${departments}">
								<option value="${item.id}">${item.department_value}</option>
							</c:forEach>
						</select>
					</div>
				</div>

				<!--提交按钮  -->
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-filter="save">立即提交</button>
					</div>
				</div>

				<div class="layui-form-item">
					<c:choose>
						<c:when test="${resultMsg}==''">
							<span style="color: red">${resultMsg}</span>
						</c:when>
						<c:otherwise>
							<span style="color: #1BC550">${resultMsg}</span>
						</c:otherwise>
					</c:choose>
				</div>
			</form>
		</div>
	</div>




	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layui/layui.all.js"></script>
	<script>
		layui.use('form', function() {
			var form = layui.form; //获取form模块
			//监听提交
			form.on('submit(save)', function(data) {
				alert(1234);
				console.log(data.field);
				return false;
			});
		});
		//关闭页面
		function CloseWin() {
			parent.location.reload(); //父页面刷新
			var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
			parent.layer.close(index); //再执行关闭 
		}

		function submit($, params) {
			$.post('admin/addManager.action', params, function(res) {
				if (res.status == 1) {
					layer.msg(res.message, {
						icon : 1
					}, function(index) {
						CloseWin();
					})
				} else if (res.status == 2) {
					layer.msg(res.message, {
						icon : 0
					}, function() {
						parent.location.href = '${path}/sys/toLogin';
						CloseWin();
					})
				} else {
					layer.msg(res.message, {
						icon : 0
					}, function() {
						location.reload(); // 页面刷新
						return false
					})
				}
			}, 'json');
		}
	</script>
</body>
</html>