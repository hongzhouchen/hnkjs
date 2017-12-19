function utils() {}

utils.prototype.test = function() {
	alert("ceshi");
}

utils.prototype.menudow = function() {
	alert(1234);
}
/*文字替换*/
utils.prototype.replaceMoreTxt = function(id) {}

/**/
utils.prototype.leftslider = function() {

}

/**
 * @param id  传入的按钮id
 */
utils.prototype.toTop = function(id) {

	// 判断如果窗口滚动距离小于0，隐藏按钮
	if($(window).scrollTop() < 0) {
		$(id).hide();
	}
	// 窗口滚动时，判断当前窗口滚动距离
	$(window).scroll(function() {
		if($(this).scrollTop() > 1) {
			$(id).fadeIn();
		} else {
			$(id).fadeOut();
		}
	});
	//给这个按钮绑定一个click事件
	$(id).bind('click', function() {
		$('html ,body').animate({
			scrollTop: 0
		}, 500);
		return false;
	});
}
/**
 * @param {Object} id li的UL
 * @param {Object} sliderTime 一次执行时间
 * @param {Object} nextTime  下一次触发时间
 */
utils.prototype.lislider = function(id,sliderTime,nextTime) {
	var n = $(id).find("li").height();
	var sliderfn=function() {
		$(id).animate({
			marginTop: -n
		},sliderTime, function() {
			$(this).css({
				marginTop: "0px"
			}).find("li:first").appendTo(this);
		})
	}
	var interval=setInterval(sliderfn, nextTime);
	
	$(id).find("li").hover(function(){
		 clearInterval(interval);
	},function(){
		interval=setInterval(sliderfn, nextTime);
	})
}