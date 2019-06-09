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
	Success:${cards.success }
	<br> Deck Id:${cards.deck_id }
	<br> Shuffled:${cards.shuffled }
	<br> Remaining:${cards.remaining }
	<br>

<a href="cards">Shuffle</a>

	<form action="draw-deck">
		<table>
			<tr>
			</tr>
			<tbody>
				<c:forEach var="card" items="${draw}">
					<tr>
						<td><img src="${card.image}"></td>
						<td></td>
						</th>
					</tr>
			</tbody>

			</c:forEach>
		</table>
	</form>



</body>
</html>