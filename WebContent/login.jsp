
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Login</title>
<link href="Style.css" rel="stylesheet">
</head>
<body>
	<form class="loginForm" method="POST" action="FrontController">
		<input type="hidden" name="command" value="login" /> <input
			type="text" name="login" placeholder="username" /> <input
			type="password" name="password" placeholder="password" /> <br />
		${errorLoginPassMessage} <br /> ${wrongAction} <br /> ${nullPage} <br />
		<input type="submit" value="Log in" />
	</form>
</body>
</html>