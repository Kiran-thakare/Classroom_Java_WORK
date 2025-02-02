<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>

<script type="text/javascript">
	  
	  $(document).ready(function(){
		 $("#upbtn").hide()
		 load()
	  })
	  
	  function load(){
		  
		  $.get("display",{},function(rt){
			  const data=JSON.parse(rt)
			  
			  var row=""
			  data.map(ele=>{
					  row+="<tr><td>"+ele.id+"</td><td>"+ele.name+"</td><td>"+ele.email+"</td><td>"+ele.phone+"</td><td><button class='btn btn-warning' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-success'onclick='editUser("+ele.id+")'>edit</button></td></tr>"
			  })
			  $("#tbody").html(row)
		  })
	  }
	  
	  function addUser(){
		  
		  var name=$("#name").val()
		   var email=$("#email").val()
		    var phone=$("#phone").val()
		    
		    $.post("adduser",{name,email,phone},function(rt){
		    	alert(rt)
		    	load()
		    })
	  }
	  
			function editUser(id){
		  
			  $.get("edit",{id,"action":"edit"},function(rt){
			  const data=JSON.parse(rt)
			   var id=$("#id").val(data.id)
				  var name=$("#name").val(data.name)
				   var email=$("#email").val(data.email)
				    var phone=$("#phone").val(data.phone)
				    $("#upbtn").show()
				    $("#subtn").hide()
				  
				   
			  
		  })
	  }
			
			function deleteUser(id){
				  
				  $.get("edit",{id,"action":"delete"},function(rt){
					     alert()
					     load()
					  })
				  }
			
			
	  function updateUser(){
		  var id=$("#id").val()
		  var name=$("#name").val()
		   var email=$("#email").val()
		    var phone=$("#phone").val()
		    
		    $.post("updateUser",{id,name,email,phone},function(){
		    	alert(rt)
		    	load()
		    })
		    
		    
	  }
	  
	  function  searchuser(value) {
		 
		  $.get("search",{value},function(rt){
			  const data=JSON.parse(rt)
			  var row=""
			  data.map(ele=>{
					  row+="<tr><td>"+ele.id+"</td><td>"+ele.name+"</td><td>"+ele.email+"</td><td>"+ele.phone+"</td><td><button class='btn btn-warning' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-success'onclick='editUser("+ele.id+")'>edit</button></td></tr>"
			  })
			  $("#tbody").html(row) 
		  })
	}
	  
	
	
	</script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-4 card mt-4 p-3">
				<h1 class="text-center text-success">User Register</h1>


				<form action="">


					<input type="hidden" id="id">
					<div class="form-group mt-2">
						<label for="name">User name</label> <input type="text" id="name"
							class="form-control">
					</div>
					<div class="form-group mt-2">
						<label for="email">Email</label> <input type="email" id="email"
							class="form-control">
					</div>

					<div class="form-group mt-2">
						<label for="phone">Phone No</label> <input type="text" id="phone"
							class="form-control">
					</div>
					<div class="form-group mt-2 d-flex justify-content-center">
						<button class="btn btn-success" id="subtn" onclick="addUser()">Submit</button>
						&nbsp;

						<button class="btn btn-warning" id="upbtn" onclick="updateUser()">Update</button>
					</div>





				</form>




			</div>
			<div class="col-1"></div>
			<div class="col-7 card mt-4">
				<h1 class="text-center text-success">User Details</h1>
				<div class="form-group mt-2">
					<input type="text" id="search" placeholder="Search User Name" class="form-control" onkeyup="searchuser(value)">
				</div>
				<hr>
				<table class="table">

					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Email</th>
							<th>Phone</th>
							<th colspan="2">Action</th>
						</tr>
					</thead>

					<tbody id="tbody">




					</tbody>

				</table>
			</div>
		</div>


	</div>

</body>
</html>