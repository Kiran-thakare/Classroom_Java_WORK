<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div class="container ">
		<div class=row>
			<div class="col-8 card  p-4 mt-5">
				<h1 class="text-center">User Records</h1>
				<span class="text-center text-success">${update }</span> <span
					class="text-center text-success">${err }</span>
				<table class="table table-striped mt-2">

					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Email</th>
						<th colspan="2">Action</th>

					</tr>

					<%
					String email = (String) session.getAttribute("email");
					if (email == null) {

						request.setAttribute("user", "user Not Found...!!!");
						request.getRequestDispatcher("Login.jsp").forward(request, response);
					}

					ArrayList<Student> user = (ArrayList<Student>) request.getAttribute("user");
					for (Student st : user) {
					%>
					<tr>

						<td><%=st.getId()%></td>
						<td><%=st.getUname()%></td>
						<td><%=st.getEmail()%></td>
						<td><a href="update?uid=<%=st.getId()%>&action=update"
							class="btn btn-success">Update</a></td>
						<td><a href="update?uid=<%=st.getId()%>&action=delete"
							class="btn btn-danger">Delete</a></td>
					</tr>


					<%
					}
					%>


				</table>

				<div class="d-flex justify-content-center">
					<a href="logout" class="btn btn-info">Logout</a>
				</div>
			</div>
		</div>

	</div>


</body>
</html>