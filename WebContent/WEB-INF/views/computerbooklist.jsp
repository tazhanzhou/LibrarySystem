<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Computer Book List</title>
</head>
<body>

	<div align="center">
		Computer Book List
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Type</th>
			</tr>

			<c:forEach var="book" items="${bookList}">
				<tr>
					<td><c:out value="${book.name}"></c:out></td>
					<td><c:out value="${book.type}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>

</body>
</html>