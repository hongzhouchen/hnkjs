<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp" %>

<html>
<body>
	<form class="layui-form" action="updataBanner.action" enctype="multipart/form-data" method="post">
		
		<input type="hidden" value="${banner.id}" name="id"/>
		<div class="layui-form-item">
			<label class="layui-form-label">图片文字一</label>
			<div class="layui-input-block">
				<input type="text" name="b_txt1" placeholder="图片文字一"
					class="layui-input" value="${banner.b_txt1}">
			</div>
			<div class="layui-form-mid layui-word-aux layui-text-green">轮播图上显示的文字一，不是必填项！</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">图片文字一的链接</label>
			<div class="layui-input-block">
				<input type="text" name="b_txtlink1" placeholder="图片文字一的链接"
					class="layui-input" value="${banner.b_txtlink1}">
			</div>
			<div class="layui-form-mid layui-word-aux">轮播图上显示的文字一的链接，不是必填项！</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">图片文字二</label>
			<div class="layui-input-block">
				<input type="text" name="b_txt2" placeholder="图片文字二"
					class="layui-input" value="${banner.b_txt2}">
			</div>
			<div class="layui-form-mid layui-word-aux">轮播图上显示的文字二，不是必填项！</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">图片文字二的链接</label>
			<div class="layui-input-block">
				<input type="text" name="b_txtlink2" placeholder="图片文字二的链接"
					class="layui-input" value="${banner.b_txtlink2}">
			</div>
			<div class="layui-form-mid layui-word-aux">轮播图上显示的文字二的链接，不是必填项！</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">上传图片</label>
			<div class="layui-input-inline">
				<input type="file" name="bannerimg" required lay-verify="required"
					autocomplete="off" class="layui-input" id="up">
			</div>
			<div class="layui-form-mid layui-word-aux">图片必须上传，不可为空！</div>
			<!--上传前图片展示  -->
			<img id="ImgPr" width="100%"  src="${banner.b_imgurl}"  alt="上传前图片展示 "/>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">图片链接地址</label>
			<div class="layui-input-block">
				<input type="text" name="b_imglink" placeholder="图片链接地址"
					class="layui-input" value="${banner.b_imglink}">
			</div>
			<div class="layui-form-mid layui-word-aux">轮播图片跳转的链接地址，不是必填项！</div>
		</div>


		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>
	<script type="text/javascript" src="<%=basePath%>/js/uploadPreview.js"></script>
	<script>
		$(function() {
			$("#up").uploadPreview({
				Img : "ImgPr",
				Width : 120,
				Height : 120
			});
		});
	</script>
	<script>
		//Demo
		layui.use('form', function() {
			var form = layui.form;
			//监听提交
			form.on('submit(formDemo)', function(data) {
				layer.msg(JSON.stringify(data.field));
				return true;
			});
		});
	</script>
</body>
</html>