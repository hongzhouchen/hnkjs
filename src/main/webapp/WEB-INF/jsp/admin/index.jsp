<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="publicInfo.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 后台大布局 - Layui</title>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">layui 后台布局</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="">控制台</a></li>
				<li class="layui-nav-item"><a href="">商品管理</a></li>
				<li class="layui-nav-item"><a href="">用户</a></li>
				<li class="layui-nav-item"><a href="javascript:;">其它系统</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">邮件管理</a>
						</dd>
						<dd>
							<a href="">消息管理</a>
						</dd>
						<dd>
							<a href="">授权管理</a>
						</dd>
					</dl></li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img">admin
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed"><a class=""
						href="javascript:;">系统设置</a> <i class="fa fa-plug"
						aria-hidden="true"></i>
						<dl class="layui-nav-child">
							<dd>

								<a href="javascript:;">基础参数</a>
							</dd>
							<dd>
								<a href="javascript:;">SEO设置</a>
							</dd>
							<dd>
								<a href="javascript:;">轮播图设置</a>
							</dd>
							<dd>
								<a href="javascript:;">合作伙伴设置</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">模块管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">后台模块</a>
							</dd>
							<dd>
								<a href="javascript:;">前端菜单</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">用户管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">前台用户</a>
							</dd>
							<dd>
								<a href="javascript:;">管理员</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">文章管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">文章类别</a>
							</dd>
							<dd>
								<a href="javascript:;">文章列表</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;">组织架构</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">部门管理</a>
							</dd>
							<dd>
								<a href="javascript:;">角色管理</a>
							</dd>
							<dd>
								<a href="javascript:;">权限管理</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="">数据统计</a></li>
				</ul>
			</div>
		</div>

		<div class="layui-body" id="container">
			<!-- 内容主体区域 -->
			<div class="layui-tab layui-tab-card kit-tab" lay-filter="kitTab">
				<ul class="layui-tab-title">
					<li class="" lay-id="-1"><i class="layui-icon"></i> 控制面板</li>
				</ul>
				<div class="kit-tab-tool"> 操作&nbsp;<i class="fa fa-caret-down"></i>
				</div>
				<div class="kit-tab-tool-body layui-anim layui-anim-upbit" style="display: none;">
					<ul>
						<li class="kit-item" data-target="refresh">刷新当前选项卡</li>
						<li class="kit-line"></li>
						<li class="kit-item" data-target="closeCurrent">关闭当前选项卡</li>
						<li class="kit-item" data-target="closeOther">关闭其他选项卡</li>
						<li class="kit-line"></li>
						<li class="kit-item" data-target="closeAll">关闭所有选项卡</li>
					</ul>
				</div>
				<div class="layui-tab-content">
					<div class="layui-tab-item" lay-item-id="-1">
						<iframe src="main.html" style="height: 169px;"></iframe>
					</div>
				</div>
			</div>
		</div>

		<div class="layui-footer">
			<!-- 底部固定区域 -->
			©www.hnkjs.com - 湖南矿产资源交易中心
		</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layui/layui.all.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;
            
		});
	</script>
</body>
</html>