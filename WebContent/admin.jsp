<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page of repair appliances</title>
</head>
<body>
	<div class="user">
		<p>${user}
			<a href="FrontController?command=logout">Logout</a>
		</p>
	</div>
	
	<nav class="four">
	<ul>
		<li><a href="newuser.jsp">Add user</a></li>
		<li><a href="FrontController?command=GETUSERLIST">List users</a></li>
	</ul>
	</nav>

</body>
</html>