<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Model.Student"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Records</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-9 card p-4">
				<span class="text-center text-success">${update }</span>

				<table class="table ">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
						<th colspan="2">Action</th>
					</tr>

					<%
					String email = (String) session.getAttribute("email");

					if (email == null) {
						request.setAttribute("error", "please login First..!!!!");
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					}

					ArrayList<Student> view = (ArrayList<Student>) request.getAttribute("show");
					for (Student s : view) {
					%>


					<tr>
						<td><%=s.getId()%></td>
						<td><%=s.getName()%></td>
						<td><%=s.getEmail()%></td>
						<td><a href="update?uid=<%=s.getId()%>&action=update"
							class="btn btn-primary">Update</a></td>
						<td><a href="update?uid=<%=s.getId()%>&action=delete"
							class="btn btn-success">Delete</a></td>
					</tr>
					<%
					}
					%>



				</table>
				<a href="logout" class="btn btn-success">LOGOUT</a>

			</div>


		</div>


	</div>

</body>
</html>