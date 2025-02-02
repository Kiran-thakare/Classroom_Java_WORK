<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col-5 card p-4 mt-5 offset-4">

				<h1 class="text-center text-success">Registration</h1>
				<span class="text-center text-success">${success }</span>
				<form action="reg" method="post">

					<div class="form-group">
						<label for="uname">UserName</label> <input type="text"
							class="form-control" id="uname" name="uname">
					</div>

					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email">
					</div>

					<div class="form-group">
						<label for="pass">Password</label> <input type="password"
							class="form-control" id="pass" name="pass">
					</div>



					<div class="d-flex justify-content-center mt-2 ">

						<button class="btn btn-success">Submit</button>

					</div>

					<div class="d-flex justify-content-center mt-2 ">

						<a href="Login.jsp">Already Registered?Login</a>

					</div>


					<!--  <div class="d-flex justify-content-center mt-2 ">
						<a href="display">DisplayUser</a>
					</div> -->
				</form>


			</div>



		</div>



	</div>

</body>
</html>