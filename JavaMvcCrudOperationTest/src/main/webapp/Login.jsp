<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-4 card p-4 mt-5 offset-4">

				<h1 class="text-center text-success">Login</h1>
				<span class="text-center text-success">${logout }</span> <span
					class="text-center text-success">${user}</span>

				<form action="log" method="post">


					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email">
					</div>

					<div class="form-group">
						<label for="pass">Password</label> <input type="password"
							class="form-control" id="pass" name="pass">
					</div>



					<div class="d-flex justify-content-center mt-2 ">

						<button class="btn btn-success">Login</button>

					</div>
					<div class="d-flex justify-content-center mt-2 ">
						<a href="Registration.jsp">New User?Register</a>
					</div>
				</form>


			</div>



		</div>



	</div>
</body>
</html>