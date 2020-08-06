<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<div class="form">
		<form class="param" action="FrontController">
			<h2>Отследить заказ</h2>
			<input type="hidden" name="command" value="SEARCH"/>
			<input type="text" name="order_number" placeholder="Номер заказа"> 
			<input type="submit" name="submit" value="Поиск">				
		</form>
	</div>

	<div class="form">
		<div class="block">
			<h2>Есть проблемы с техникой?</h2>
			<p>Заполните заявку!</p>
		</div>
		<div>
			<form class="param" action="FrontController">
				<input type="hidden" name="command" value="ADDNEWREQUEST"/> 
				<select type="text" name="type_repair">
					<option value="1">Diagnostics</option>
					<option value="2">Preventive Work</option>
					<option value="3">Repair Work</option>
				</select><br><br>
				<select type="text" name="item">
					<option value="1">Computer</option>
					<option value="2">Smartphone</option>
					<option value="3">Monitor</option>
					<option value="4">Notebook</option>
					<option value="6">Freezer</option>
					<option value="7">Dishwasher</option>
					<option value="8">Conditioner</option>
					<option value="9">Oven</option>
					<option value="10">Microwave</option>
				</select><br>
				<textarea type="text" name="description" rows="5" cols="45">Problem description			
				</textarea>				 			 				
				<br /> <br /> <input type="hidden" name="command" value="ADDNEWREQUEST" />
				<input type="submit" name="submit" value="Отправить">
			</form>
		</div>			
	</div>
	<div class="form">
		<form class="param" action="FrontController">
			<h2>Понравилось качество ремонта?</h2>
			<p>Оцените его!</p>
			<input type="hidden" name="command" value="SETMARK"/>
			<input type="text" name="order_number" placeholder="Номер заказа">
			<input type="text" name="mark" placeholder="Оценка">
			<input type="submit" name="submit" value="Оценить">	
		</form>
	</div>
	<div class="bbb">
		<h4>Ремонт бытовой техники на дому</h4>
		<h4>Рынок современной техники не перестает удивлять своими
			инновациями. Электроника достигла, казалось бы, максимума своего
			развития и простому потребителю не всегда удается разобраться во всех
			нюансах и тонкостях прогрессивных технологий. Починка такой техники
			требует профессионального подхода, ведь важно не испортить мудреный
			механизм. Наша компания предлагает услуги ремонта бытовой техники и
			электроники по доступным ценам. Сломалась кофемашина или
			микроволновка? Разбился экран планшета или не включается ноутбук?
			Наши мастера справятся с задачей любой сложности. Если дома сломалась
			техника - мы с удовольствием ее починим!</h4>
	</div>


</body>
</html>