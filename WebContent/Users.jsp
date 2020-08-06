<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="Style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
	<div class="user">
		<p>${user}
			<a href="FrontController?command=logout">Logout</a>
		</p>
	</div>
	<table cellspacing="0">
		<tr>
			<th>ID_user</th>
			<th>ID_type_user</th>
			<th>Name</th>
			<th>Surname</th>
			<th>Login</th>
			<th>Password</th>
			<th>Phone</th>	
			<th>Status</th>
			<th>BlockStatus</th>
			<th>Remove</th>
		</tr>
		<c:forEach var="userList" items="${userList}">
			<tr>
				<td><c:out value="${userList.ID_USERS}" /></td>
				<td><c:out value="${userList.ID_TYPE_USERS}" /></td>
				<td><c:out value="${userList.name}" /></td>
				<td><c:out value="${userList.surname}" /></td>
				<td><c:out value="${userList.login}" /></td>
				<td><c:out value="${userList.password}" /></td>
				<td><c:out value="${userList.phone}" /></td>				
				<td><c:out value="${userList.status}" /></td>		
				<td><c:out value="${userList.block_status}" /></td>			
				<c:choose>
					<c:when test="${userList.ID_TYPE_USERS==4}">
							<td></td>
					</c:when>
					<c:otherwise>
							<td><a href="FrontController?command=REMOVEUSER&ID_USERS=${userList.ID_USERS}">Remove</a></td>
					</c:otherwise>
				</c:choose>		
			</tr>
		</c:forEach>
	</table>
</body>
</html>