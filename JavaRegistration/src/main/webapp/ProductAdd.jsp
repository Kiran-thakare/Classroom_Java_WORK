<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ProductAdd</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-5 card p-4 mt-4 offset-3 ">
				<h1 class="text-center">Add Product</h1>
				<form action="addpro" method="post" class="p-2">


					<div class="form-group">
						<label for="proname">Product_Name</label> <input type="text"
							class="form-control" id="proname" name="proname">
					</div>

					<div class="form-group">
						<label for="prize">Product_Prize</label> <input type="text"
							class="form-control" id="prize" name="prize">
					</div>
					<div class="form-group">
						<label for="qty">Quantity</label> <input type="text"
							class="form-control" id="qty" name="qty">
					</div>
					<div class="form-group d-flex justify-content-center mt-3 mb-3 ">
						<button class="btn btn-primary">Add</button>
					</div>
					 
					 

				</form>
			</div>


		</div>
	</div>
</body>
</html>