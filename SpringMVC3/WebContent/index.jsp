<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>
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
		$(".test").click(function(){
			$.ajax({
				url:"json",
				type:"post",
				dataType:"json",
				success:function(msg){
					var tb = "<table>";
					tb += "<tr><th>ID</th><th>LASTNAME</th><th>EMAIL</th><th>GENDER</th><th>DEPARTMENT</th></tr>"
					for(i in msg){
						tb += "<tr><th>" + msg[i].id + "</th><th>" + msg[i].lastName + "</th><th>" + msg[i].email + "</th><th>" + msg[i].gender + "</th><th>" + msg[i].department.name + "</th></tr>";
					}
					$("body").append(tb);
				}
			})
		})
	})
</script>
</head>
<body>
	<a href="emps">员工信息</a></br></br>
	<input class="test" type="button" value="json测试"/></br></br>
	<a href="pic">下载</a>
</body>
</html>