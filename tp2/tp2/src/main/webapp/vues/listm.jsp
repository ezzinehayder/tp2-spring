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
<c:set var="cxt" value="${pageContext.request.contextPath}" /> 

</head>
<body>
<h2>Liste des Magasins</h2>
<table border="1">
<tr><th>Id</th><th>Nom</th><th>lieu</th></tr>
<c:forEach items="${listem}" var="m" >
	<tr><td>${m.id }</td><td>${m.nom }</td><td>${m.lieu }</td>
	<td><a href="${cxt }/produit/${m.id}">liste des produits</a> </td>
	
	
	</tr>
</c:forEach>
</table>

<a href="ajoutProduit">Ajouter un produit</a>



</body>
</html>