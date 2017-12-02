<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理</title>
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form class="form-horizontal" role="form" action="Employee_save"
		method="post">
		<div class="form-group">
			<label for="firstname" class="col-sm-2 control-label">名字</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="firstname"
					placeholder="请输入名字" name="employee.empName">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">密码</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="lastname"
					placeholder="请输入密码" name="employee.password">
			</div>
		</div>
		<div class="form-group">
			<label for="lastname" class="col-sm-2 control-label">性别</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="lastname"
					placeholder="请输入性别" name="employee.gender"">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default">添加员工</button>
				<h2>
					<a href="Employee_AllEmployee">所有员工</a>
				</h2>
				<s:if test="hasActionErrors()">
					<div class="errors">
						<s:actionerror />
					</div>
				</s:if>
			</div>
		</div>
	</form>
</body>
</html>
