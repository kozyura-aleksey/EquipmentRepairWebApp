<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New User</title>
</head>
<body>
	<div>
		<form class="loginForm" action="FrontController">
			<input type="hidden" name="command" value="addnewuser"> 
			<div>		
			<label>Type User</label><br>		
			<select name="type_user">
				<option value="1">Master</option>
				<option value="2">User</option>
				<option value="3">Moderator</option>
				<option value="4">Admin</option>
			</select>			
			
			</div>
			<input type="text" name="name" placeholder="Имя"> 
			<input type="text" name="surname" placeholder="Фамилия"> 			 
			<input type="text" name="login" placeholder="Login"> 
			<input type="text" name="password" placeholder="Password"> 
			<input type="text" name="phone" placeholder="Телефон"> 
				<input type="hidden" name="command" value="addnewuser">
				<input type="submit" name="submit" value="Добавить">
		</form>
	</div>
</body>
</html>