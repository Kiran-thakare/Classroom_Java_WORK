<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserRecords</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<table class="table">

		<tr>
			<th>Id</th>
			<th>User name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Gender</th>
			<th>Country</th>
			<th>Language</th>
			<th>Image</th>
			<th colspan="2">Action</th>

		</tr>

		<c:forEach items="${users}" var="li">

			<tr>

				<td>${li.getId()}</td>
				<td>${li.getUsername()}</td>
				<td>${li.getEmail()}</td>
				<td>${li.getPhone()}</td>
				<td>${li.getGender()}</td>
				<td>${li.getCountry()}</td>
				<td>${li.getLanguage()}</td>
				<td><img alt="${li.getImage()}" src="img/${li.getImage()}"
					height="50px" width="50px"></td>
				<td><a href="update?id=${li.getId()}&action=edit"
					class="btn btn-primary">Edit</a></td>

				<td><a href="update?id=${li.getId()}&action=delete"
					class="btn btn-info">Delete</a></td>

			</tr>




		</c:forEach>




	</table>
</body>
</html>