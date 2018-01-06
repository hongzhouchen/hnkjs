<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../publicInfo.jsp"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link href="css/admin/userManager.css" rel="stylesheet">
    <script type="text/javascript">
        $(document).ready(function(){
              //ajax请求后台数据
              getShopCustomerManagePageInfo();
              //点击搜索时 搜索数据
              $("#selectButton").click(function(){ 
                getShopCustomerManagePageInfo();
                currentPageAllAppoint = 1; //当点击搜索的时候，应该回到第一页
                toPage();//然后进行分页的初始化
              })
           toPage();
        });
        //分页参数设置 这些全局变量关系到分页的功能
        var startAllAppoint = 0;
        var limitAllAppoint = 10;
        var currentPageAllAppoint = 1;
        var totalPageAllAppoint = 0;
        var dataLength = 0;
        //ajax请求后台数据
        function getShopCustomerManagePageInfo(){
            $.ajax({
                type:"post",
                async:false,
                url:"。。。",
                data:{start:startAllAppoint, limit:limitAllAppoint,selectValue:$("#selectValue").val()},
                success:function(data,status){
                    data=eval("("+data+")");
                    getManagerInfo(data.root);
                    startAllAppoint = data.currentResult;//当前页数(后台返回)
                    totalPageAllAppoint = data.totalPage;//总页数(后台返回)
                }
            });
        }
       function getManagerInfo(data){
            var s = "<tr><th>用户名</th><th>用户头像</th><th>登录次数</th><th>上一次登录时间</th><th>上一次登录IP</th><th>是否已经登录</th><th>操作</th></tr>";
            $.each(data,function(index,obj){
                    s+='<tr><td>'+obj.user_name+'</td>';
                    s+='<td><img src='+obj.user_head +' width="60" height="60" /></td>';
                    s+='<td>'+obj.logincount+'</td>';
                    s+='<td>'+obj.lastlogintime+'</td>';
                    s+='<td>'+obj.lastloginip+'</td>';
                    s+='<td>'+obj.islogin+'</td>';
                    s+='<td> <a  class="layui-btn" ids='+obj.id+'>查看更多</a></td></tr>';
            });

            if(data.length>0){
                $("#t_customerInfo").html(s);
            }else{
                $("#page1").hide();
                $("#t_customerInfo").html("<br/><span style='width:10%;height:30px;display:block;margin:0 auto;'>暂无数据</span>");
            }
        }
        //分页
        function toPage(){
            layui.use(['form', 'laypage', 'layedit','layer', 'laydate'], function() {
                var form = layui.form(),
                    layer = layui.layer,
                    layedit = layui.layedit,
                    laydate = layui.laydate,
                    laypage = layui.laypage;
                var nums = 10;
                  //调用分页
                  laypage({
                    cont: 'paged'
                    ,pages: totalPageAllAppoint //得到总页数，在layui2.X中使用count替代了，并且不是使用"总页数"，而是"总记录条数"
                    ,curr: currentPageAllAppoint
                    ,skip: true
                    ,jump: function(obj, first){
                        currentPageAllAppoint = obj.curr;
                        startAllAppoint = (obj.curr-1)*limitAllAppoint;
                      //document.getElementById('biuuu_city_list').innerHTML = render(obj, obj.curr);
                      if(!first){ //一定要加此判断，否则初始时会无限刷新
                    	//一定要把翻页的ajax请求放到这里，不然会请求两次。
                      getShopCustomerManagePageInfo();
                          //location.href = '?page='+obj.curr;
                        }
                    }
                  });


            });
        };

    </script>
</head>
<body>
    <div class="admin-main">
                <blockquote class="layui-elem-quote">
                <form class="layui-form" action="" >
                <div class="layui-form-item">
                <div class="layui-input-inline">
                    <input type="text" id="selectValue" lay-verify="required" placeholder="客户姓名，电话" autocomplete="off" class="layui-input">
                </div>
                <button class="layui-btn" type="button" id="selectButton">搜索</button>
                </div>
                </form>
                <span><a href="shop_customer_manager_page_info">显示所有客户</a></span>
                </blockquote>
                <fieldset class="layui-elem-field">
                    <legend>客户列表</legend>
                    <div class="layui-field-box layui-form">
                        <table class="layui-table admin-table" id="t_customerInfo">

                        </table>
                    </div>
                </fieldset>
                <div class="admin-table-page">
                    <div id="paged" class="page">
                    </div>
                </div>
            </div>
</body>
</html>