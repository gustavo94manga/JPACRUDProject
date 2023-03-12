<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create One Piece Card</title>

<!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="css/main.css"> -->
<jsp:include page="bootstrapHead.jsp"/>

</head>
<body>

		<form action="createdCard.do" method="POST">
		
		Card Number:<input type="number" name="id" /> <br>
		First Name: <input type="text" name="name" /> <br> 
		Last Name: <input type="text" name="lastName" /> <br> 
		<label for="description">Description:</label><br>
		<textarea id="description" name="description" rows="4" cols="50"></textarea>
		<br> 
		Card Type: <input type="text" name="cardType" /> <br> 
		Power Level: <input type="number" name="powerLevel" /> <br> 
		Attribute: <input type="text" name="attribute" /> <br> 
		Don Cost: <input type="number" name="don" /> <br> 
		Color: <input type="text" name="color" /> <br> 
		Price: <input type="number" name="price" step="any" min="0" max="10000"/> <br> 
		<fieldset>
    <legend>Select a Rarity:</legend>

    <div>
      <input type="radio" id="Common" name="rarity" value="Common"
             checked>
      <label for="Common">Common</label>
    </div>

    <div>
      <input type="radio" id="Uncommon" name="rarity" value="Uncommon">
      <label for="Uncommon">Uncommon</label>
    </div>

    <div>
      <input type="radio" id="Rare" name="rarity" value="Rare">
      <label for="Rare">Rare</label>
    </div>
    <div>
      <input type="radio" id="SuperRare" name="rarity" value="SuperRare">
      <label for="SuperRare">SuperRare</label>
    </div>
    <div>
      <input type="radio" id="Secret" name="rarity" value="Secret">
      <label for="Secret">Secret</label>
    </div>
</fieldset>
		Set: <input type="text" name="set" /> <br> 

<input class="btn btn-primary" type="submit" value="Create Card" />
	</form>
	<br>
	
<form action="home.do" method="GET">
		<input class="btn btn-primary" type="submit" value="Cancel" />
	</form>
	
</body>
</html>