<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<form:form action="addemployee" method="post" modelAttribute="employee">
		<form:hidden path="id" />
		<form:label path="name">Employee name</form:label>
		<form:input path="name" />
		<form:label path="email">Employee Email</form:label>
		<form:input path="email" />
		<form:label path="pass">password</form:label>
		<form:input path="pass" />

		<input type="submit">


	</form:form>


	<hr>

	<table border="2px">

		<tr>

			<th>Id</th>
			<th>Employee Name</th>
			<th>Email</th>
			<th colspan="2">Action</th>


		</tr>

		<c:forEach items="${employees }" var="emp">
			<tr>
				<td>${emp.getId()}</td>
				<td>${emp.getName()}</td>
				<td>${emp.getEmail()}</td>
				<td><a href="delete?eid=${emp.getId() }">Delete</a></td>
				<td><a href="edit?eid=${emp.getId() }">Edit</a></td>



			</tr>



		</c:forEach>

	</table>
</body>
</html>