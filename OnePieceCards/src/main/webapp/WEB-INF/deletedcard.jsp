<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Deleted OP Card</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>

<jsp:include page="navbar.jsp"/>

<%-- <%-- <div class="container-fluid">
<c:choose>
<c:when test="${empty deleteWith }">No One Piece Cards Deleted.</c:when>
<c:otherwise>
  <h5>${deleteWith.id } ${deleteWith.name} (${deleteWith.cardType})</h5>
  <p>${deleteWith.powerLevel }</p>
  <p>${deleteWith.attribute }</p>
  <blockquote>${deleteWith.description}</blockquote>
  </c:otherwise>
  </c:choose>
</div> --%> --%>
${deleteWith }

	
</body>
</html>