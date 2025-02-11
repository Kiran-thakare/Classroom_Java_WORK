<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="regStudent" method="post" modelAttribute="student">
		<form:hidden path="id" />
		<form:label path="name">Name</form:label>
		<form:input path="name" />
		<form:label path="email">Email</form:label>
		<form:input path="email" />
		<form:label path="pass">pass</form:label>
		<form:input path="pass" />
		<input type="submit">

	</form:form>

	<hr>

	<table border="2px">

		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th colspan="2">Action</th>
		</tr>

		<c:forEach items="${students }" var="s">
			<tr>
				<td>${s.getId() }</td>
				<td>${s.getName() }</td>
				<td>${s.getEmail() }</td>

				<td><a href="delete?did=${s.getId() }">Delete</a></td>
				<td><a href="edit?eid=${s.getId() }">Edit</a></td>


			</tr>


		</c:forEach>



	</table>


</body>
</html>