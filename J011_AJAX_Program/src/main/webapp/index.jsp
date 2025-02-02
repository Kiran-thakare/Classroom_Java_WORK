<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>

<script type="text/javascript">
	function search() {
        var data=$("#data").val()
		$.get("myservlet", {data}, function(rt) {
			$("#e_data").html(rt)
		})
	}
</script>

</head>
<body>

	<input type="text" id="data" onkeyup="search()">
	<button>search</button>
	<div id="e_data"></div>

</body>
</html>