<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/JQuery-1.12.4.js"></script>
<script type="text/javascript">
	$(function(){
		$(".del").click(function(){
			if(confirm("确定要删除吗?")){
				$("#form1").attr("action",$(this).attr("href")).submit();
				return false;
			}
			return false;
		})
	});
</script>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>LASTNAME</th>
			<th>EMAIL</th>
			<th>GENDER</th>
			<th>DEPARTMENTNAME</th>
			<th>OPTION(<a href="emp">ADD</a>)
			</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr>
				<td>${emp.id }</td>
				<td>${emp.lastName }</td>
				<td>${emp.email }</td>
				<td>${emp.gender==0?'女':'男' }</td>
				<td>${emp.department.name }</td>
				<td><a href="emp/${emp.id}">UPDATE</a>/<a class="del" href="emp/${emp.id}">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<form id="form1" method="post">
		<input type="hidden" name="_method" value="DELETE"/>
	</form>
	
</body>
</html>