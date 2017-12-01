<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>员工信息界面</h1>
${employee}
<form action="Employee_UpdateEmployee">
<div>
<span>员工编号</span>
<input  type="text" name="employee.empId"  value="${sessionScope.employee.empId}"/>
</div>
<br>
<div>
<span>员工姓名</span>
<input  type="text" name="employee.empName"  value="${sessionScope.employee.empName}"/>
</div>
<div>
<span>员工密码</span>
<input  type="text" name="employee.password"  value="${sessionScope.employee.password}"/>
</div>
<br>
<div>
<span>员工性别</span>
<input  type="text" name="employee.gender"  value="${sessionScope.employee.gender}"/>
</div>
<br>
<input type="submit" value="提交"/>
</form>
</body>
</html>