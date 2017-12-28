<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/admin/userManager.css" rel="stylesheet">
</head>
<body>
	<div class="contanier">
		<blockquote class="layui-elem-quote layui-text">管理员列表</blockquote>

		<div class="row">
			<a href="/" class="layui-btn">添加管理员</a>
		</div>
		<div class="row">
			<table class="layui-hide" id="managerlist"
				style="text-align: center;"></table>

			<table class="layui-table">
				<colgroup>
					<col width="60">
					<col width="200">
					<col>
				</colgroup>
				<thead>
					<tr>
						<th>编号</th>
						<th>图片地址</th>
						<th>图片链接地址</th>
						<th>图片文字一</th>
						<th>图片文字一链接</th>
						<th>图片文字二</th>
						<th>图片文字二链接</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${BannerList}" varStatus="status">
						<tr ids="${item.id}">
							<td>${status.index+1}</td>
							<td>${item.b_imgurl}</td>
							<td>${item.b_imglink}</td>
							<td>${item.b_txt1}</td>
							<td>${item.b_txtlink1}</td>
							<td>${item.b_txt2}</td>
							<td>${item.b_txtlink2}</td>
							<td><a class="layui-btn layui-btn-danger"
								onclick="deletOneBanner('${item.id}')">删除</a> <a
								class="layui-btn" onclick="upDataOneBanner('${item.id}')">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

	</div>

	<script type="text/javascript">
		layui.use('table', function() {
			var table = layui.table;
			table.render({
				elem : '#demo',
				width:'100%',
				height : 500,
				method:'post',
				url : '/demo/table/user/' //数据接口
				,page : true //开启分页
				,cols : [ [ //表头
				{
					field : 'id',
					title : 'ID',
					width : 80,
					sort : true,
					fixed : 'left'
				},
				{
					field : 'user_name',
					title : '用户名',
					width : 80
				},
				{
					field : 'login_account',
					title : '登录名称',
					width : 80
				},
				{
					field : 'sex',
					title : '性别',
					width : 80,
					sort : true
				}, {
					field : 'city',
					title : '城市',
					width : 80
				}, {
					field : 'sign',
					title : '签名',
					width : 177
				}, {
					field : 'experience',
					title : '积分',
					width : 80,
					sort : true
				}, {
					field : 'score',
					title : '评分',
					width : 80,
					sort : true
				}, {
					field : 'classify',
					title : '职业',
					width : 80
				}, {
					field : 'wealth',
					title : '财富',
					width : 135,
					sort : true
				},{
					field :'action',
					title:'操作',
				}
				
				] ]

			});

		});
	</script>

</body>
</html>