<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>所有图书</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$(".delete").click(function(){
		var  con =  confirm("你确定要删除此图书?");
		if(!con){
			return false;
		}
	});
});
</script>
</head>
<body>
<h1>员工系统</h1>
<table border="1" >
<tr>
<th>员工编号</th>
<th>数据库中编号</th>
<th>员工姓名</th>
<th>员工密码</th>
<th>员工性别</th>
</tr>
<s:iterator value="#session.employeeList" status="indexValue" var="employee">   
        <s:if test="#indexValue.odd == true">  
            <tr style="background-color:#FFFFCD">  
        </s:if>  
        <s:else>  
            <tr style="background-color:#F0FFFF">  
        </s:else>  
            <td>  
             
                <s:property value="#indexValue.index + 1"/>
            </td>
            <td>    
                <s:property value="#employee.empId"/> 
            </td>  
            <td>    
                <s:property value="#employee.empName"/> 
            </td>
            <td>
                <s:property value="#employee.password"/>
            </td>
            <td>
                <s:property value="#employee.gender"/> 
            </td>  
            <td>
            <a class="delete" href="Employee_DeleteEmployee?employee.empId=${employee.empId}">删除</a>
            </td> 
            <td>
            <a  href="Employee_EmployeeDetails?employee.empId=${employee.empId}">修改</a>
            </td>
    </s:iterator>  
</table>
<h1><a href="http://localhost:10109/SSH_Integration/index.jsp">添加员工</a></h1>
</body>
</html>