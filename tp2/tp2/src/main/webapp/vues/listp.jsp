<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Liste des Produits</h2>
<table border="1">
<tr><th>Id</th><th>desc</th><th>prixa</th><th>prixv</th></tr>
<c:forEach items="${listep}" var="p" >
	<tr><td>${p.id }</td><td>${p.description }</td><td>${p.prixa }</td><td>${p.prixv }</td>
	
	</tr>
</c:forEach>
</table>
<a href="ajoutProduit">Ajouter un produit</a>

<a href="home">liste des Magasins</a>



</body>
</html>