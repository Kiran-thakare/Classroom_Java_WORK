<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome ${name }</h1>



	<h1>
		Current User
		<%=application.getAttribute("cUser")%></h1>
	<h1>
		Total User
		<%=application.getAttribute("tUser")%></h1>



	<a href="logout">logout</a>

</body>
</html>