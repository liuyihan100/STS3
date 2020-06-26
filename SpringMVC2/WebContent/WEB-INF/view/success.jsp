<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<c:forEach var="employee" items="${requestScope['employees'] }">
				${employee.salary}<br/>
			</c:forEach>
		</tr>
	</table>
</body>
</html>