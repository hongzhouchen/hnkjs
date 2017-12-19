<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<div class="row-footer">
			<div class="container">
				<div class="row">
					<ul>
						<li>
							<a href="/">联系我们 </a>
						</li>
						<li>
							<a href="/">意见反馈 </a>
						</li>
						<li>
							<a href="/">网站地图 </a>
						</li>
						<li>
							<a href="/">法律法规 </a>
						</li>

					</ul>
				</div>
				<div class="row">
					<div class="sub_footertext">Copyright©2016.湖南国际矿产资源交易中心有限公司.
						<a href="http://icp.chinaz.com/hnkjs.com/" style="color:#b3b3b3;"> 湘ICP备16007703号 </a> &nbsp; 建议使用IE9.0以上浏览器，1280×800以上分辨率</div>
				</div>
			</div>
		</div>

		<!--悬浮-->
		<div class="xuanfu">
			<ul>
				<li id="totop"><img src="img/icon/top.png"></li>
				<li id="ewm"><img src="img/icon/xf-wx.png">
					<div class="ewm-box"><img src="img/ewm.jpg" /></div>
				</li>
				<li><img src="img/icon/xf-yj.png" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo"></li>
			</ul>
		</div>

		<!--发送反馈意见-->
		<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
						<h4 class="modal-title" id="exampleModalLabel">反馈意见</h4>
					</div>
					<div class="modal-body">
						<form>
							<div class="form-group">
								<label for="recipient-name" class="control-label">联系方式</label>
								<input type="phone" class="form-control" id="recipient-name">
							</div>
							<div class="form-group">
								<label for="message-text" class="control-label">留言</label>
								<textarea class="form-control" id="message-text"></textarea>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<!--<button type="button" class="btn btn-default" data-dismiss="modal" >关闭</button>-->
						<button type="button" class="btn btn-primary" data-dismiss="modal" >发送</button>
					</div>
				</div>
			</div>
		</div>

		<script src="js/utils.js" type="text/javascript"></script>
		<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
		<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script src="http://msy.hnkjs.com/msymarket/js/jquery.mCustomScrollbar.concat.min.js" charset="UTF-8"></script>
		<script src="http://msy.hnkjs.com/msymarket/js/echarts.min.js" type="text/javascript" charset="UTF-8"></script>

		<script>
			var utils = new utils();
			utils.toTop('#totop');
			utils.lislider("#gg-content", 1, 4000);

			$(".navbar_pc ul li").hover(function() {
				$(this).addClass("active")
			}, function() {
				$(this).removeClass("active")
			});
			$(".xuanfu li#ewm").hover(function() {
				$(".ewm-box").fadeIn();
			}, function() {
				$(".ewm-box").fadeOut();
			});
		</script>
</body>
</html>