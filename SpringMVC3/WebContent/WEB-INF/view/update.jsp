<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		<input type="hidden" name="id" value="${employee.id }"/>
		<input type="hidden" name="_method" value="PUT"/>
		<table>
			<tr>
				<th colspan="2">UPDATE</th>
			</tr>
			<tr>
				<td>LASTNAME</td>
				<td><input name="lastName" value="${employee.lastName }"/></td>
			</tr>
			<tr>
				<td>EMAIL</td>
				<td><input name="email" value="${employee.email }"/></td>
			</tr>
			<tr>
				<td>GENDER</td>
				<td>
					<input type="radio" name="gender" value="1" ${employee.gender==1?'checked':'' }/>男
					<input type="radio" name="gender" value="0" ${employee.gender==0?'checked':'' }/>女
				</td>
			</tr>
			<tr>
				<td>DEPARTMENT</td>
				<td>
					<select name="department.id">
						<c:forEach items="${departments}" var="department">
							<option value="${department.id}" ${employee.department.id==department.id?'selected':'' }>${department.name}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<th colspan="2"><input type="submit" value="SUBMIT"></input></th>
			</tr>
		</table>
	</form>
</body>
</html>