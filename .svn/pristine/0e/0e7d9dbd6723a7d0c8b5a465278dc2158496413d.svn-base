<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<blockquote class="layui-elem-quote layui-text">添加管理员</blockquote>
	<form class="layui-form" id="addManagerForm" name="addManagerForm">
		<div class="layui-form-item">
			<label class="layui-form-label">用户名:</label>
			<div class="layui-input-block">
				<input type="text" name="user_name" lay-verify="required"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
			<label class="layui-form-label">登录名:</label>
			<div class="layui-input-block">
				<input type="text" name="login_account" lay-verify="required"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码：</label>
			<div class="layui-input-block">
				<input type="password" name="login_pass" lay-verify="required"
					placeholder="密码长度为5~15位,默认密码为 888888" autocomplete="off"
					class="layui-input" value="888888">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-filter="">立即提交</button>
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
	<script>
		layui.use('form', function() {
			var form = layui.form; //获取form模块
			//监听提交
			form.on('submit(addManagerForm)', function(data) {
		            $.post('user_systemallot_insert.do', params, function (res) {
		                if (res.status==1) {
		                     layer.msg(res.message,{icon:1},function(index){
		                     CloseWin();
		                    }) 
		                }else if(res.status==2){

		                layer.msg(res.message,{icon:0},function(){

		                parent.location.href='${path}/sys/toLogin';
		                CloseWin();
		                })
		                }else{
		                layer.msg(res.message,{icon:0},function(){
		                location.reload();   //页面刷新
		                     return false
		                })
		                } 

		            }, 'json');
				return false;
			});
		}
		);
		//关闭页面
		function CloseWin(){
		    parent.location.reload();  //父页面刷新
		    var index = parent.layer.getFrameIndex(window.name);  //先得到当前iframe层的索引
		    parent.layer.close(index);  //再执行关闭 
		 }

	</script>
</body>
</html>