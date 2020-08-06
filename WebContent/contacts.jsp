<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contacts</title>
</head>
<body>
	<div class="user">
		<p>${user}
			<a href="FrontController?command=logout">Logout</a>
		</p>
	</div>
	<nav class="four">
	<h2></h2>
	<ul>
		<li><a href="UserPage.jsp"><i class="fa fa-home fa-fw"></i>Главная</a></li>
		<li><a href="FrontController?command=GETREQUESTLIST">Заказы</a></li>
		<li><a href="price.jsp">Цены</a></li>
		<li><a href="contacts.jsp">Контакты</a></li>
	</ul>
	</nav>
	<h1>Мы находимся:</h1>
	<div class="form">
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2310.4681778640174!2d39.721669315886516!3d54.61336098026408!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x4149e23d10f85765%3A0x8f8c8c884de2af41!2z0KDRj9C30LDQvdGB0LrQuNC5INCz0L7RgdGD0LTQsNGA0YHRgtCy0LXQvdC90YvQuSDRgNCw0LTQuNC-0YLQtdGF0L3QuNGH0LXRgdC60LjQuSDRg9C90LjQstC10YDRgdC40YLQtdGCICjQoNCT0KDQotCjKQ!5e0!3m2!1sru!2sru!4v1583266526525!5m2!1sru!2sru"
			width="686" height="450" frameborder="0" style="border: 0;"
			allowfullscreen=""></iframe>

	</div>
</body>
</html>