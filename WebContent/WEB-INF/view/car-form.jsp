<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Car searching</title>
	<link rel="stylesheet" type="text/css"           
		  href="${pageContext.request.contextPath}/resources/css/main.css">
	<link rel="icon" type="image/jpg"
		  href="${pageContext.request.contextPath}/resources/images/car.jpg" >
</head>
<body>
<main>
 	<h2>Let's find your dream car!</h2> <hr>
 	<p>* fields are required!</p>
 	
	<form:form action="processData" modelAttribute="sportCar">
	
		Brand* : <form:input path="brand" /> 
		<form:errors path="brand" cssClass="error" />
		<br><br>
		Color*: <form:input path="color"/>
		<form:errors path="color" cssClass="error" />
		<br><br>
		Horsepower: <form:input path="horsepower" />
		<form:errors path="horsepower" cssClass="error" />
		<br><br>
		VIN: <form:input path="vin" />
		<form:errors path="vin" cssClass="error" />
		<br><br>
		Location: <form:input path="location" />
		<form:errors path="location" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit" />

		
	</form:form>
</main>
</body>
</html>