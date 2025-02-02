<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<span class="d-flex justify-content-center text-success"><b>${Success}</b></span>
	<span class="text-success"><b>${url}</b></span>

	<div class="container ">
		<div class="row">
			<div class="col-9 card p-2 mt-5 offset-2">
				<h1 class="text-center">Records</h1>

				<%
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran", "root", "kiran@1727");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from product");
				%>
				<table class="table table-hover p-4 mt-5">
					<thead class="">
						<tr>
							<th scope="col">Product_id</th>
							<th scope="col">Product_Name</th>
							<th scope="col">product_price</th>
							<th scope="col">product_qty</th>

						</tr>
					</thead>
					<tbody>

						<%
						while (rs.next()) {
						%>
						<tr>

							<td><%=rs.getInt("id")%></td>
							<td><%=rs.getString("product_name")%></td>

							<td><%=rs.getInt("product_price")%></td>
							<td><%=rs.getInt("product_qty")%></td>
						</tr>
						<%
						}
						%>


					</tbody>

				</table>

				<div class="d-flex justify-content-center">
					<a class="btn btn-primary" href="ProductAdd.jsp">Add Product</a>


				</div>
			</div>


		</div>



	</div>

</body>
</html>