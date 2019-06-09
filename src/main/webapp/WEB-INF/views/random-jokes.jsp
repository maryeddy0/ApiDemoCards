<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Joke</th>
		</tr>
		<tbody>
			<c:forEach var="joke" items="${list}">
				<tr>
					<td>${item.joke}</td>
					<td>${item.joke}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>