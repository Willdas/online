<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>登录</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<meta name="keywords"
	content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
<link href="../../resources/css/login/style.css" rel='stylesheet'
	type='text/css' />
<script src="../../resources/js/jquery/jquery-2.1.0.js"></script> 
</head>
<body>
	<script>
		$(document).ready(function(c) {
			$('.close').on('click', function(c) {
				$('.login-form').fadeOut('slow', function(c) {
					$('.login-form').remove();
				});
			});
		});
	</script>
	<h1>后台登录</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"></label>
			<label class="lbl-2"></label> 
			<label class="lbl-3"> </label>
		</div>
		<div class="clear"></div>
		<div class="avtar">
			<img src="../../resources/images/avtar.png" />
		</div>
		<form action="../../eBookLogin/loginManagentPage.do" method="post">
			<input type="text" name="username" class="text" value="用户名" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '用户名';}">
			<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
			<input type="submit" value="登录">
		</form>
	</div>
	<div class="copy-rights">
		<p>Copyright © 2017&nbsp;onlineReading.net &nbsp;<a href="htts://www.onlineread.net">返回首页</a></p>
	</div>
</body>
</html>