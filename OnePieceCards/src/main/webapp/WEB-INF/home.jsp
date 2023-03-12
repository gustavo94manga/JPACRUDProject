<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One Piece Cards</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container-fluid">

	<h1>One Piece Romance Dawn</h1>
	<a target="_blank" href="https://i.pinimg.com/736x/ca/26/9e/ca269ede910c4e29d862b6fab704c305.jpg"><img src="https://i.pinimg.com/736x/ca/26/9e/ca269ede910c4e29d862b6fab704c305.jpg" alt="One Piece Card Game Logo." /></a><br>
	<form action="getCard.do" method="GET">
		Card Number: <input type="number" name="opcId" /> 
		<input class="btn btn-primary" type="submit" value="Show Card" />
	</form>
	<!-- <form action="getAllCards.do" method="GET">
		Card Number: <input type="number" name="opcId" /> 
		<input class="btn btn-primary" type="submit" value="Show All Cards" />
	</form> -->
	
	<c:choose>
	<c:when test="${empty cards }">No One Piece Cards found.</c:when>
	<c:otherwise>
	<table class="table table-striped table-hover">
	
	<tr>
	<th>ID</th>
	<th>First Name</th>
	</tr>
	
	<c:forEach var="opcards" items="${cards }">
	<tr>
	<td>${opcards.id }</td>
	<td>${opcards.name}</td>
	</tr>

	</c:forEach>

	</table>
	</c:otherwise>
	</c:choose>
	
</div>

</body>
</html>