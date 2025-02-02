<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">


<script type="text/javascript">
	function validateFirstName() {
		var name = document.getElementById("fname").value;
		var errorElement = document.getElementById("fnameError");

		var regex = /^[A-Za-z]+$/;

		if (name == "") {

			errorElement.innerHTML = "Please Enter First Name";
		} else if (!regex.test(name)) {

			errorElement.innerHTML = "Only alphabets are allowed";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validatelastName() {
		var name = document.getElementById("lname").value;
		var errorElement = document.getElementById("lnameError");

		var regex = /^[A-Za-z]+$/;

		if (name == "") {

			errorElement.innerHTML = "Please Enter Last Name";
		} else if (!regex.test(name)) {

			errorElement.innerHTML = "Only alphabets are allowed";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validateEmail() {
		var email = document.getElementById("email").value;

		var regex = /^[A-Za-z0-9._-]+@[A-Za-z.-]+\.[A-Za-z]{2,4}$/;

		var errorElement = document.getElementById("emailError");

		if (email == "") {

			// Please enter first name
			errorElement.innerHTML = "Please Enter Email Address";
		} else if (!regex.test(email)) {

			// Only alphabets are allowed
			errorElement.innerHTML = "Invalid Email address";
		} else {
			// remove error

			errorElement.innerHTML = "";
		}

	}

	function validateContact() {
		var contact = document.getElementById("contact").value;

		var regex = /^[0-9]{10}$/;

		var errorElement = document.getElementById("contactError");

		if (contact == "") {

			errorElement.innerHTML = "Please Enter Number";
		} else if (!regex.test(contact)) {

			errorElement.innerHTML = "Invalid contact number";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validatePassword() {

		var password = document.getElementById("pass").value;
		var errorElement = document.getElementById("passwordError");

		var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@.#$!%*?&])(?!.\s)[A-Za-z\d@.#$!%*?&]{8,15}$/;

		if (password == "") {
			errorElement.innerHTML = "Please Enter Password";
		} else if (!regex.test(password)) {

			errorElement.innerHTML = "Must contains atleast one uppercase, lowercase, digit and length up to 16 characters";
		} else {

			errorElement.innerHTML = "";
		}

	}

	function validateConfirmpassword() {

		var cpass = document.getElementById("cpassword").value;
		var password = document.getElementById("pass").value;
		var errorElement = document.getElementById("cpasswordError");

		if (cpass == "") {
			errorElement.innerHTML = "Please Renter Confirm Password";
		} else if (cpass != password) {

			errorElement.innerHTML = "PassWord Not Match Check Password";
		} else {

			errorElement.innerHTML = "";
		}

	}
</script>
</head>
<body>

	<form action="ser1">

		<h1>Registration Form</h1>

		<table cellpadding="7px" cellspacing="7px">

			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" id="fname"
					onblur="validateFirstName();"></td>
				<td><span style="color: red;" id="fnameError"></span></td>
			</tr>

			<tr>
				<td>Last Name</td>
				<td><input type="text" name=" lname" id="lname"
					onblur="validatelastName();"></td>
				<td><span style="color: red;" id="lnameError"></span></td>
			</tr>

			<tr>
				<td>Email Address</td>
				<td><input type="email" name="email" id="email"
					onblur="validateEmail();"></td>
				<td><span style="color: red;" id="emailError"></span></td>
			</tr>

			<tr>
				<td>Contact</td>
				<td><input type="number" name="contact" id="contact" min="0"
					onblur="validateContact();"></td>
				<td><span style="color: red;" id="contactError"></span></td>
			</tr>

			<tr>
				<td>Address</td>
				<td><textarea rows="5" cols="21" name="address" id="address"></textarea></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><input type="radio" value="male" name="gender">Male
					<input type="radio" value="female" name="gender">Female</td>
			</tr>

			<tr>
				<td>Hobbies</td>
				<td><input type="checkbox" name="hobby" value="reading">Reading<br>
					<input type="checkbox" name="hobby" value="dancing">Dancing<br>
					<input type="checkbox" name="hobby" value="playing">Playing<br>
					<input type="checkbox" name="hobby" value="singing">Singing<br>

				</td>
			</tr>

			<tr>
				<td>Education</td>
				<td><select>
						<option>--- Select Education ---</option>
						<option value="10th">10th</option>
						<option value="12th">12th</option>
						<option value="BE">BE</option>
						<option value="BCom">B.COM</option>
						<option value="BA">BA</option>
						<option value="Other">Others</option>
				</select></td>
			</tr>

			<tr>
				<td>Resume</td>
				<td><input type="file" name="resume"></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="password" id="pass"
					onblur="validatePassword()"></td>
				<td><span style="color: red;" id="passwordError"></span></td>
			</tr>

			<tr>
				<td>Confirm Password</td>
				<td><input type="password" name="cpassword" id="cpassword"
					onblur="validateConfirmpassword();"></td>
				<td><span style="color: red;" id="cpasswordError"></span></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" id="submit" value="Insert" class="btn btn-primary"></td>
			</tr>

		</table>

	</form>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>





