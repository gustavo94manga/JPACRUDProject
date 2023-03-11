<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>One Piece Cards</title>
</head>
<body>
	<h1>One Piece Cards</h1>
	
	<c:choose>
	<c:when test="${empty cards }">No One Piece Cards found.</c:when>
	<c:otherwise>
	<c:forEach var="opcards" items="${cards }">
	<li>${opcards.id } ${opcards.name}</li>
	</c:forEach>
	</c:otherwise>
	</c:choose>

</body>
</html>