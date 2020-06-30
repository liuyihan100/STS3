<%@page pageEncoding="GBK" contentType="text/html; charset=GBK" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
<title>修改员工信息</title>
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
	<form action="${pageContext.servletContext.contextPath }/emp" method="post">
		<input type="hidden" name="_method" value="PUT"/>
		<table>
			<tr>
				<th colspan="5">UPDATE</th>
			</tr>
			<tr>
				<td>ID</td>
				<td>${employee.employeeId }</td>
			</tr>
			<tr>
				<td>NAME</td>
				<td><input name="lastName" value="${employee.lastName }"/></td>
			</tr>
			<tr>
				<td>SALARY</td>
				<td><input name="salary" value="${employee.salary }"/></td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td>
					<select name="department.id">
						<c:forEach items="${departments }" var="dep">
							<option value="${dep.id }" ${employee.department.id==dep.id?'selected':""}>${dep.name }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="5">
					<input type="submit" value="SUBMIT"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
