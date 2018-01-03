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
										placeholder="填写右侧的验证码" />
										<img src="img/login/passcode.jpg" alt="" width="100" height="32" class="passcode" style="height: 43px; cursor: pointer;" onClick="this.src=this.src+'?'">
								</div>
							</div>
						</div>
						<div style="padding:10px 30px;">
							<input type="button" id="loginbtn" class="button button-block bg-main text-big input-big" value="登录">
						</div>
						<div style="padding: 0px 30px;color:red; display: none" id="errmsg">123</div>
					</div>
				</form>
			</div>
		</div> 
	</div>
	<script src="js/jquery.min.js"></script>
<script type="text/javascript">
   $(documcent).ready(function(){
	   var msg=document.getElementById("errmsg");
	   
   })
</script>
</body>
</html>