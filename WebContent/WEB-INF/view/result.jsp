<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Car Searching</title>
	<link rel="stylesheet" type="text/css"           
		  href="${pageContext.request.contextPath}/resources/css/main.css">
	<link rel="icon" type="image/jpg"
		  href="${pageContext.request.contextPath}/resources/images/car.jpg" >
</head>
<body>
<main>
	<h2>Welcome, we analysed your request!</h2> <br>
	
	You are looking for: ${brand} <br>
	
	which year is: ${year} <br>
	
	We will send you our offers on this email: ${email} <br>
	
	<h5>Mayby you will be interested these cars:<h5>
	
		<c:if test="${not empty cars}">
			<c:forEach items="${cars}" var="car">
			   	${car}<br>
			</c:forEach>	    
		</c:if>		
	<br>
	Best wishes! Team "Fasters" ;)
	<img src="${pageContext.request.contextPath}/resources/images/car.jpg" alt="car"> 

</main>
</body>
</html>