<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>博客</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="static/plugins/Bootstrap/css/bootstrap.css">
<link rel="stylesheet"
	href="static/plugins/Bootstrap/css/bootstrap-theme.css">
<link rel="stylesheet" href="static/css/UserInterface/base.css">

<script src="static/plugins/jquery/jquery-1.12.2.js"></script>
<script src="static/plugins/Bootstrap/js/bootstrap.js"></script>

<script type="text/javascript">
	$(function() {
		//注册主页头部页面点击事件
		$("a[itype='item-link']").click(function() {
			var target = $(this).attr("target");
			$.get($("base").attr("href") + target, function(data) {
				$("#cont").html(data);
			});
		});

		//进站先浏览主页
		//$("a.active").click();

		//登录TODO
		$("#signin_button").click(function() {

			/* $("#personal_bar").show();
			$("#sign_bar").hide(); */
			window.location.href = "Login/toLogin";
		});

		//登出TODO
		$("#signout_button").click(function() {
			$("#personal_bar").hide();
			$("#sign_bar").show();

		});
	});
</script>
<style>
.main-container {
	margin-top: 50px;
	margin-bottom: 50px;
	width: 60%;
	margin-left: 20%;
}

.padding-top-5 {
	margin-top: 5px;
}

.base-footer {
	position: fixed;
	bottom: 0px;
	background-color: #888;
	width: 100%;
	height: 20px;
}
}
</style>
</head>

<body>
	<div>
		<div class="container">
			<div class="navbar navbar-inverse navbar-fixed-top">
				<ul class="nav nav-pills padding-top-5" style="float:left">
					<li class="nav-item"><a class="nav-link active"
						itype="item-link" href="javascript:void('');"
						target="/MainPage/getMainPage">主页</a></li>
					<li class="nav-item"><a class="nav-link" itype="item-link"
						href="javascript:void('');" target="/Blog/getBlogPage">博客</a></li>
					<li class="nav-item"><a class="nav-link" itype="item-link"
						href="javascript:void('');" target="/Message/getMessagePage">留言板</a></li>
					<li class="nav-item"><a class="nav-link" itype="item-link"
						href="javascript:void('');" target="/MainPage/getAboutPage">关于</a></li>
				</ul>
				<div style="float:right;" class="padding-top-5" id="sign_bar">
					<button type="button" class="btn btn-link padding-top-5"
						id="signin_button">登录</button>
					<button type="button" class="btn btn-link padding-top-5"
						id="signup_button">注册</button>
				</div>
				<div style="float:right;display:none;" class="padding-top-5"
					id="personal_bar">
					<button type="button" class="btn btn-link padding-top-5"
						id="personal_center_button">个人中心</button>
					<button type="button" class="btn btn-link padding-top-5"
						id="signout_button">退出登录</button>
				</div>


			</div>
		</div>

		<div class="main-container">
			<div class="panel panel-default">
				<div class="panel-body" id="cont">
					<!-- 	进站默认页面引入 -->
					<jsp:include page="mainPage.jsp" flush="true" />
				</div>
			</div>
		</div>
	</div>
	<foot class="base-footer">
	<div style="width:100%;text-align:center">@copyright 2017</div>
	</foot>
</body>
</html>
