<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Price</title>
</head>
<body>
<div class="user">
	<p>${user} <a href="FrontController?command=logout">Logout</a></p>	
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

<div class="form">
<a class="aa">Цены представлены в рублях.</a>
<table cellspacing="0">
   <tr>
    <th>&nbsp;</th><th>Диагностика</th><th>Профилактические работы</th><th>Ремонтные работы</th>
   </tr>
   <tr>
    <td>Крупная бытовая техника</td><td>1000</td><td>2000</td><td>5000</td>
   </tr>
   <tr>
    <td>Мелкая бытовая техника</td><td>500</td><td>1000</td><td>3000</td>
   </tr>
   <tr>
    <td>Аудио техника</td><td>3000</td><td>5000</td><td>7000</td>
   </tr>
   <tr>
    <td>Телевизоры</td><td>3000</td><td>5000</td><td>7000</td>
   </tr>
   <tr>
    <td>Телефоны</td><td>500</td><td>1000</td><td>3000</td>
   </tr>
   <tr>
    <td>Мониторы</td><td>1000</td><td>3000</td><td>5000</td>
   </tr>
  </table>

</div>

</body>
</html>