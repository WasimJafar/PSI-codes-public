<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	
	<h1>Next page</h1>

	<table>
		<c:forEach items="${students}" var="student">
			<tr>
				<td><c:out value="${student.id}"/></td>
				<td><c:out value="${student.fname}" /></td>
				<td><c:out value="${student.dob}"/></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>