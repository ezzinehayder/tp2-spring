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


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter un produit</title>

<c:set var="cxt" value="${pageContext.request.contextPath}" /> 
</head>
<body>

<form:form method="POST" action="saveProduit" modelAttribute="p" >
<p> description <form:input path="description"/> </p>
<p>quantite <form:input path="numex"  /></p>
<p>prix d'achat<form:input path="prixa"  /></p>
<p>prix de vente<form:input path="prixv"  /></p>
<p>Magasin <form:select path="m" items="${listmag}"   /></p>



<p> <input type="submit" value="Enregistrer" />
</form:form>
<a href="home">liste des Magasins</a>


</body>
</html>