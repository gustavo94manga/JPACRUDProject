<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updated OP Card</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>


</head>
<body>
<jsp:include page="navbar.jsp"/>

<div class="container-fluid">
<c:choose>
<c:when test="${empty updateWith }">No One Piece Cards to Update.</c:when>
<c:otherwise>
  <h5>${updateWith.id } ${updateWith.name} (${updateWith.lastName})</h5>
  <blockquote>${updateWith.description}</blockquote>
  <p>${updateWith.cardType }</p>
  <p>${updateWith.powerLevel }</p>
  <p>${updateWith.attribute}</p>
  <p>${updateWith.don}</p>
  <p>${updateWith.color}</p>
  <p>${updateWith.price}</p>
  <p>${updateWith.rarity}</p>
  </c:otherwise>
  </c:choose>
</div>

</body>
</html>