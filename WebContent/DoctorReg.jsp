<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String doctor = (String)request.getAttribute("doctor");
	if(doctor != null){
		%>
		<p><%=doctor %></p>
		<%
	}
	%>

	<center>
		<form action="DoctorController" method="post">
		
		<input type="text" name="name" placeholder="Enter patient name"><br><br>
		<input type="text" name="staff_id" placeholder="Staff ID"><br><br>
		<input type="password" name="password" placeholder="Password"><br><br>
		<input type="submit" value="submit">
		</form>
	</center>

</body>
</html>