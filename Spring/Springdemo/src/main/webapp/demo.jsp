<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addEmp">
<input type="text" name="Id" placeholder="Enter Id">
<input type="text" name="Name" placeholder="Enter Name">
<input type="number" name="Sal" placeholder="Enter Salary">
Department<select name="Dept">
<Option>ALL</Option>
<Option>HR</Option>
<Option>IT</Option>
</select>
<button type="Submit">Add</button>
<button type="Reset">Clear</button>
</form>
</body>
</html>