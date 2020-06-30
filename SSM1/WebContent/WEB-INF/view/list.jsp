<%@page pageEncoding="GBK" contentType="text/html; charset=GBK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
<title>员工信息</title>
<style type="text/css">
	
	td, th {
		border: 1px white solid;
		text-align: center;
		padding: 10px;
		font-size: 20px;
		color: white;
	}
	
	table {
		margin: 50px auto;
		border-spacing: 0; /* 设置边框间距为0，合并边框后无意义 */
		border-collapse: collapse; /* 合并边框 */
	}
	
	tr{
		background-color: black;
	}
	
	tr:hover{
		background-color: red;
	}
	
	a:link{
		color: white;
		text-decoration: none;
	}
	
	a:hover{
		color:#88f;
	}
	
</style>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>SALARY</th>
			<th>DEPARTMENT</th>
			<th>OPTION(<a href="emp">UPDATE</a>)</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.lastName}</td>
				<td>${employee.salary}</td>
				<td>${employee.department.name}</td>
				<td><a href="${pageContext.servletContext.contextPath }/emp/${employee.employeeId }">UPDATE</a> <a href="emp">DELETE</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">${page}</td>
		</tr>
	</table>
</body>
</html>
