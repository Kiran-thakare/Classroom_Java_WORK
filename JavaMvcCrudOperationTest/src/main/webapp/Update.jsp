<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
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

				<h1 class="text-center text-success">Update</h1>
				
				<form action="modify" method="post">

					<div class="form-group">
						<input type="hidden" id="id" name="id" value=${st.getId() }>
					</div>
					<div class="form-group">
						<label for="uname">UserName</label> <input type="text"
							class="form-control" id="uname" name="uname"
							value=${st.getUname() }>
					</div>

					<div class="form-group">
						<label for="email">Email</label> <input type="email"
							class="form-control" id="email" name="email"
							value=${st.getEmail() }>
					</div>

					<div class="form-group">
						<label for="pass">Password</label> <input type="password"
							class="form-control" id="pass" name="pass" value=${st.getPass() }>
					</div>



					<div class="d-flex justify-content-center mt-2 ">

						<button class="btn btn-success">Update</button>

					</div>


				</form>


			</div>



		</div>



	</div>

</body>
</html>