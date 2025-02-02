<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Image Uploading</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-4 card mt-2 p-2">


				<h1 class="text-center text-success">Image Uploading</h1>
				<form action="upload" method="post" enctype="multipart/form-data">

					<div class="form-group mt-4">
						<label for="uname">Enter Name</label> <input type="text"
							name="uname" id="uname" placeholder="enter name"
							class="form-control">
					</div>
					<div class="form-group mt-2">
						<label for="img">Add Image</label> <input type="file" name="file"
							id="img" class="form-control">
					</div>
					<div class="form-group mt-2 " align="center">

						<input type="submit">
					</div>


				</form>




			</div>
			<div class="col-1"></div>
			<div class="col-7 card mt-2">

				<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
					url="jdbc:mysql://localhost:3306/javasql" user="root"
					password="kiran@1727" var="data" />


				<table class="table">

					<tr>

						<th>Id</th>
						<th>name</th>
						<th>Image</th>
						<th colspan="2" align="center">Action</th>

					</tr>



					<sql:query var="dt" dataSource="${data }">  
         select * from imgUpload;  
	     </sql:query>



					<c:forEach items="${dt.rows }" var="d">

						<tr>

							<td>${ d.id}</td>
							<td>${ d.uname}</td>
							<td><img alt="image not load" src="img/${ d.img}"
								width="150px" height="150px"></td>
							<td><a href="update?uid=${d.id }&action=delete"
								class="btn btn-warning">Delete</a></td>
							<td><a href="update?uid=${d.id }&action=edit"
								class="btn btn-success">Update</a></td>
						</tr>

					</c:forEach>





				</table>


			</div>



		</div>


	</div>








</body>
</html>