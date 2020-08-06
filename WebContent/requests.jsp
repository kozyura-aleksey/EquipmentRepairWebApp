<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h2></h2>
	<ul>
		<li><a href="UserPage.jsp"><i class="fa fa-home fa-fw"></i>Главная</a></li>
		<li><a href="FrontController?command=GETREQUESTLIST">Заказы</a></li>
		<li><a href="price.jsp">Цены</a></li>
		<li><a href="contacts.jsp">Контакты</a></li>
	</ul>
	</nav>

	<table cellspacing="0">
		<tr>
			<th>Предмет</th>
			<th>Ремонт</th>
			<th>Имя</th>
			<th>Фамилия</th>
			<th>Телефон</th>
			<th>Оценка</th>
			<th>Номер</th>
			<th>Статус</th>
			<th>Описание</th>
		</tr>
		<c:forEach var="requestList" items="${requestList}">
			<tr>
				<td><c:out value="${requestList.repair}" /></td>
				<td><c:out value="${requestList.item}" /></td>
				<td><c:out value="${requestList.name}" /></td>
				<td><c:out value="${requestList.surname}" /></td>
				<td><c:out value="${requestList.phone}" /></td>
				<td><c:out value="${requestList.mark}" /></td>		
				<td><c:out value="${requestList.order_number}" /></td>	
				<td><c:out value="${requestList.status}" /></td>	
				<td><c:out value="${requestList.description}" /></td>				
			</tr>
		</c:forEach>
		</table>
</body>
</html>