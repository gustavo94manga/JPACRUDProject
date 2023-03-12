<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Card Info</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>

<jsp:include page="navbar.jsp"/>

<div class="container-fluid">

<c:choose>
	<c:when test="${empty displayAll }">No One Piece Cards found.</c:when>
	<c:otherwise>
	<table class="table table-striped table-hover">
	
	<tr>
	<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Description</th>
	<th>Card Type</th>
	<th>Power Level</th>
	<th>Attribute</th>
	<th>Don Cost</th>
	<th>Color</th>
	<th>Price</th>
	<th>Rarity</th>
	<th>Set</th>
	</tr>
	
	<c:forEach var="opcards" items="${displayAll }">
	<tr>
	<td>${opcards.id }</td>
	<td>${opcards.name}</td>
	<td>${opcards.lastName }</td>
	<td>${opcards.description }</td>
	<td>${opcards.cardType }</td>
	<td>${opcards.powerLevel }</td>
	<td>${opcards.attribute }</td>
	<td>${opcards.don }</td>
	<td>${opcards.color }</td>
	<td>${opcards.price }</td>
	<td>${opcards.rarity }</td>
	<td>${opcards.set }</td>
	
	</tr>

	</c:forEach>

	</table>
	</c:otherwise>
	</c:choose>
	

</div>

</body>
</html>