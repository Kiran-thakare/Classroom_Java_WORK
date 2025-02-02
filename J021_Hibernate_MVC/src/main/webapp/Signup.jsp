<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
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
			<div class="col-4 card mt-4 offset-4">
				<h5 class="text-center mt-3 text-primary">Registration</h5>
				<span class="text-center text-danger">${insert}</span>
				<div class="form">
					<!-- Create form  -->
					<form action="signin" method="post">
						<div class="form-group mt-2">
							<label for="uname">User name</label> <input type="text"
								class="form-control" id="uname" name="uname"> <span
								class="text-center text-danger">${error}</span>
						</div>

						<div class="form-group mt-2">
							<label for="email">Email </label> <input type="email"
								class="form-control" id="email" name="email">
						</div>
						<div class="form-group mt-2">
							<label for="pass">Password</label> <input type="password"
								class="form-control" id="pass" name="pass">
						</div>


						<div class="d-flex justify-content-center mt-3 mb-3 ">
							<button type="submit" class="btn btn-primary ">Submit</button>

						</div>
						<div class="d-flex justify-content-center mt-3 mb-3">
							Have You already Register?<a href="Login.jsp"
								class="link-opacity-25-hover">Login</a>
						</div>
					</form>


				</div>


			</div>


		</div>



	</div>

</body>
</html>