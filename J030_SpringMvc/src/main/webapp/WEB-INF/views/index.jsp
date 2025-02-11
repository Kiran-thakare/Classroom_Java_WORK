<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>


	<form:form action="adduser" method="post" modelAttribute="user">

		<form:label path="name">Username :</form:label>
		<form:input path="name" />
		<br>

		<form:label path="email">Email :</form:label>
		<form:input path="email" />
		<br>
		<form:label path="pass">Pass :</form:label>
		<form:input path="pass" />
		<br>

		<input type="submit">

	</form:form>



	<table border="2">

		<tr>

			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th colspan="2">Action</th>


		</tr>


		<c:forEach items="${Users }" var="dt">

			<tr>

				<td>${dt.getId() }</td>
				<td>${dt.getName() }</td>
				<td>${dt.getEmail() }</td>
				<td><a href="delete?uid=${dt.getId() }">Delete</a></td>
				<td><a href="edit?uid=${dt.getId() }">Edit</a></td>


			</tr>


		</c:forEach>


	</table>

</body>
</html>