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
	<blockquote class="layui-elem-quote layui-text">添加管理员
	</blockquote>


	<form class="layui-form" id="addManagerForm" name="addManagerForm" method="post" action="${pageContext.request.contextPath }/admin/addManager.action">
		<div class="layui-form-item">
			<label class="layui-form-label">用户名:</label>
			<div class="layui-input-block">
				<input type="text" name="user_name"  lay-verify="required"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
			<label class="layui-form-label">登录名:</label>
			<div class="layui-input-block">
				<input type="text" name="login_account"  lay-verify="required"
					autocomplete="off" placeholder="邮箱/账号" class="layui-input">
			</div>
			
			
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">密码：</label>
			<div class="layui-input-block">
				<input type="password" name="login_pass" lay-verify="required"
					placeholder="密码长度为5~15位,默认密码为 888888" autocomplete="off" class="layui-input" value="888888">
			</div>
		</div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn"  lay-filter="">立即提交</button>
			</div>
		</div>
		
		<div class="layui-form-item">
		  <c:choose>
		      <c:when test="${resultMsg}==''">
		       <span style="color:red">${resultMsg}</span>
		      </c:when>
		      <c:otherwise>
		       <span style="color:#1BC550">${resultMsg}</span>
		  </c:otherwise>
		  </c:choose>
		  
		</div>
		
	</form>
	<script>
	layui.use('form', function(){
		  var form = layui.form; //获取form模块
		  //监听提交
		  form.on('submit(addManagerForm)', function(data){
		    
		    return true;
		  });
		}
        	
	
	);
	</script>
</body>
</html>