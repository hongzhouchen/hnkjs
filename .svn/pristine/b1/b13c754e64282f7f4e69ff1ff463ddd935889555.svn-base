<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp" %>
<html>
<body>
    <p style="margin-top:20px;">
      <a href="" class="layui-btn" onclick="addBanner()">添加</a>
    </p>
	<table class="layui-table" style="text-align: center;">
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
						onclick="deletOneBanner('${item.id}')">删除</a> <a class="layui-btn"
						onclick="upDataOneBanner('${item.id}')">修改</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<script type="text/javascript">
		function deletOneBanner(id) {
			layer.open({
				content : '改信息删除后不可回复,是否确定删除',
				btn : [ '确定', '取消' ],
				btn1 : function(index, layero) {
					$.post("admin/deleteBanner.action", {
						id : id
					}, function(data, status) {
						console.log(data);
						if (data == "1" && status == "success") {
							//删除表格
							$("tr[ids='" + id + "']").remove();
							layer.close(index);//关闭弹窗  
						}
					});
				}
			});
		}
		
		function upDataOneBanner(id) {
			window.location.href = "admin/showUpdataBanner.action?id="+id;
		}
		
		/*添加一张banner图*/
		function addBanner(){
			
		}
	</script>
</body>
</html>