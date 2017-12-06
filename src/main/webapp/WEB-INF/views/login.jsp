<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="static/css/login.css" />
<script src="static/plugins/jquery/jquery-1.12.2.js"></script>
<title>Insert title here</title>
<script>
	$(function(){
		
		alert(123);
	});
	function getTime(){
		console.log("start");
		$.ajax({
			type:'get',
			url:'getTimes',
			success:function(jsonData){
				console.log(jsonData);
				alert("success to get jsondata, please check console.");
			},
			error:function(){
				alert("default to get times.");
			}
		});
	}
</script>
</head>
<body>
	<h1 style="text-align: center">这是tomcat1的页面</h1>
<!-- 
	<form action="login" method="get" style="display:none;">
		<div class="login_putin">
			<ul>
				<li>用户名：<input type="text" name="username" /></li>
				<li>密&nbsp&nbsp&nbsp码：<input type="password" name="password" /></li>
			</ul>
		</div>
		<div class="login_btn">
			<input type="submit" value="登陆">
		</div>
	</form> -->
	<input type="button" value="getValue" onclick="getTime()" />
	<div id="time_div"></div>
</body>
</html>