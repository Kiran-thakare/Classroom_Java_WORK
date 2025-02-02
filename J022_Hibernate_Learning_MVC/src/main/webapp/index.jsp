<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">

			<div class="col-5 card mt-2 offset-4">
				<h3 class="text-center text-success">Registration</h3>

				<form action="register" method="post" enctype="multipart/form-data">
					<input type="hidden" name="id" value="${user.getId() }">
					<div class="form-group">
						<label for="username">User name:</label> <input type="text"
							class="form-control" id="username" name="username"
							value="${user.getUsername()}" required>
					</div>

					<div class="form-group">
						<label for="email">Email:</label> <input type="email"
							class="form-control" id="email" name="email"
							value="${user.getEmail()}" required>
					</div>

					<div class="form-group">
						<label for="phone">Phone:</label> <input type="tel"
							class="form-control" id="phone" name="phone"
							value="${user.getPhone()}" required>
					</div>

					<div class="form-group">
						<label>Gender:</label>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="male" value="male"
								<c:if test="${user.getGender() == 'male'}">checked</c:if>
								required> <label class="form-check-label" for="male">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="female" value="female"
								<c:if test="${user.getGender() == 'female'}">checked</c:if>
								required> <label class="form-check-label" for="female">Female</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="other" value="other"
								<c:if test="${user.getGender() == 'other'}">checked</c:if>
								required> <label class="form-check-label" for="other">Other</label>
						</div>
					</div>

					<div class="form-group">
						<label for="country">Country:</label> <select class="form-control"
							id="country" name="country" required>
							<option value="">Select your country</option>
							<option value="india"
								<c:if test="${user.getCountry() == 'india'}">selected</c:if>>India</option>
							<option value="usa"
								<c:if test="${user.getCountry() == 'usa'}">selected</c:if>>USA</option>
							<option value="australia"
								<c:if test="${user.getCountry() == 'australia'}">selected</c:if>>Australia</option>
						</select>
					</div>

					<div class="form-group">
						<label>Language :</label><br>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="english"
								name="languages" value="english"
								<c:if test="${fn:contains(user.getLanguage(),'english') }">checked</c:if>>
							<label class="form-check-label" for="english">English</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="gujarati"
								name="languages" value="gujarati" <c:if test="${fn:contains(user.getLanguage(),'gujarati') }">checked</c:if>>
							<label class="form-check-label" for="gujarati">Gujarati</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" id="marathi"
								name="languages" value="marathi" <c:if test="${fn:contains(user.getLanguage(),'marathi') }">checked</c:if>>
							<label class="form-check-label" for="marathi">Marathi</label>
						</div>
					</div>

					<div class="form-group">
						<label for="image">Upload Image:</label> <input type="file"
							class="form-control-file" id="image" name="image"
							value="${user.getImage()}" required>
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
					<a href="display" class="btn btn-info">Show User</a>

				</form>
			</div>

		</div>

	</div>
</body>
</html>