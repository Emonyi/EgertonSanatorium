<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<script type="text/javascript">

	function validate(form) {
		if (form.name.value=="") {
			alert("please fill in your name");
			form.name.focus();
			return false;
		}else if (form.age.value=="") {
			alert("please fill in your age");
			form.age.focus();
			return false;
		}
		else{
			form.submit();
		}
	}

</script>
	
	<%
		String message = (String) request.getAttribute("message");
	if(message != null){
		%>
		<p><%= message %></p>
		<%
	}
	%>
	

	<center>
		<form action="PatientController" method="post">
		<input type="text" name="name"><br><br> 
		<input type="text" name="age"><br><br>
		<input type="text" name="regNo"> <br><br>
		<input type="text"name="gender"> <br><br>
		<input type="text" name="mobile"> <br><br>
		<input type="text" name="email"> <br><br>
		<input type="submit" value="submit" onClick="validate(this.form)">
		</form>
	</center>

</body>
</html>