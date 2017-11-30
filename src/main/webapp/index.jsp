<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Employee_save" method="post">
		username:<input type="text" name="employee.empName" /><br> 
		password:<input   type="password" name="employee.password" /><br>
		gender  :<input type="text"name="employee.gender" /><br>
		  <input type="submit" value="提交" />
	</form>
	<a href="Employee_AllEmployee">所有员工</a>
</body>
</html>
