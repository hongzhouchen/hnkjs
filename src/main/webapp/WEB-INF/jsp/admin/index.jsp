<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="publicInfo.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<style>
   .layui-tab{
     margin: 0px 0;
   }
   .layui-tab-content {
    padding: 0px;
}
</style>
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
		<div class="layui-header">
			<div class="layui-logo">hnkjs-CMS</div>
			<!-- 头部区域（可配合layui已有的水平导航） -->
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="admin/Manager.action">控制台</a></li>
				<li class="layui-nav-item"><a href="">数据统计</a></li>
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
				<li class="layui-nav-item"><a href="javascript:;"> <img src="http://t.cn/RCzsdCq" class="layui-nav-img"> ${Manager.user_name}</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">安全退出</a></li>
			</ul>
		</div>

		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="leftmenu">
					<li class="layui-nav-item layui-nav-itemed">
					<a  class="" href="javascript:;"><i class="layui-icon">&#xe620;</i>&nbsp;系统设置</a> 
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-title="基础参数" data-id="1">基础参数</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="SEO设置" data-id="2">SEO设置</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="轮播图设置" data-id="3">轮播图设置</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="合作伙伴设置"  data-id="4">合作伙伴设置</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe857;</i>&nbsp;模块管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-title="后台模块" data-id="5">后台模块</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="前端菜单" data-id="6">前端菜单</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe613;</i>&nbsp;用户管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-title="前台用户" data-id="7">普通用户</a>
							</dd>
							<dd>
								<a href="javascript:;" data-url="admin/manager.action" data-title="管理员" data-id="8">系统管理员</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe705;</i>&nbsp;文章管理</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-title="文章类别" data-id="9">文章类别</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="文章列表" data-id="10">文章列表</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item"><a href="javascript:;"><i class="layui-icon">&#xe647;</i>&nbsp;组织架构</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-title="部门管理" data-id="11">部门管理</a>
							</dd>
							<dd>
								<a href="javascript:;" data-title="角色管理" data-id="12">角色管理</a>
							</dd>
							<dd>
								<a href="javascript:;"  data-title="权限管理" data-url="www.baidu.com" data-id="13">权限管理</a>
							</dd>
						</dl></li>
					<li class="layui-nav-item site-demo-active">  
					<a  href="javascript:;" ><i class="layui-icon">&#xe62c;</i>&nbsp;数据统计</a>
					 <dl class="layui-nav-child">
					    <dd>
							<a href="javascript:;" data-title="文章访问数据" data-url="www.baidu.com" data-id="14">文章访问数据</a>
						</dd>
						<dd>
							<a href="javascript:;" data-title="IP访问分布" data-url="www.baidu.com" data-id="15">IP访问分布</a>
						</dd>
					 </dl>
					    
					</li>
				</ul>
			</div>
		</div>
		<div class="layui-body" id="container">
			<!-- 内容主体区域 -->
			<div class="layui-tab layui-tab-card"  lay-filter="contentTab"  lay-allowclose="true">
				<ul class="layui-tab-title">
				  <li class="layui-this">控制面板</li>
				</ul>
				<div class="layui-tab-content">
				   <div class="layui-tab-item layui-show">
				     <iframe src="admin/ControPage.action"  frameborder="0" scrolling="no" width="100%" height="100%"> </iframe>
				   </div>
				</div>
			</div>
		</div>
		
    <div class="layui-footer">
		<!-- 底部固定区域 -->
		 湖南矿产资源交易中心-author:Charles
	</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script type="text/javascript" src="layui/layui.all.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var $ = layui.jquery, 
			element = layui.element;
			//触发事件
			var active = {
            tabAdd: function (title,url, id) {
                //新增一个Tab项
                element.tabAdd('contentTab', {
                    title: title //用于演示
                  , content: '<iframe data-frameid="'+id+'" frameborder="0" name="content" scrolling="no" width="100%" height="100%" src="' + url + '"></iframe>'
                  , id: id //实际使用一般是规定好的id，这里以时间戳模拟下
                })
               
            }
          , tabChange: function (id) {
              //切换到指定Tab项
              element.tabChange('contentTab', id); //切换到
              $("iframe[data-frameid='"+id+"']").attr("src",$("iframe[data-frameid='"+id+"']").attr("src"))//切换后刷新框架
          }
            ,tabDelete: function (id) {
                element.tabDelete("contentTab", id);//删除
            }
            ,tabDeleteAll: function (ids) {//删除所有
                $.each(ids, function (i,item) {
                    element.tabDelete("contentTab", item);
                })
            }
        };
		 element.on('tab(contentTab)', function(elem) {
			location.hash = 'contentTab=' + $(this).attr('data-id');
		 });
		//给左侧菜单的所有a 标签绑定一个点击事件
		$(".layui-side-scroll li dl dd a").on('click',function () {
				  var dataid = $(this);
		            if ($(".layui-tab-title li[lay-id]").length <= 0) {
		                active.tabAdd(dataid.attr("data-title"),dataid.attr("data-url"), dataid.attr("data-id"));
		            } else {
		                var isData = false;
		                $.each($(".layui-tab-title li[lay-id]"), function () {
		                    if ($(this).attr("lay-id") == dataid.attr("data-id")) {
		                        isData = true;
		                    }
		                })
		                if (isData == false) {
		                    active.tabAdd(dataid.attr("data-title"),dataid.attr("data-url"), dataid.attr("data-id"));
		                }
		            }
		            active.tabChange(dataid.attr("data-id"));
	        });
		   
     
	        
		});
		
		
     
	</script>
</body>
</html>