<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
	<form:form action="submitData" modelAttribute="car">
	
		<%-- Name: <form:input path="person" /> --%>
		Brand: <form:input path="brand" /> 
		<br><br>
		Year:
		<form:select path="year">
			<option value="NONE">--- Select ---</option>
			<form:options items="${car.years}" />
		</form:select>
		<br><br>
		
		Condition:
		<br>
		<form:radiobutton path="gearbox" value="automatic"/>
		Automatic Transmission
		<br>
		<form:radiobutton path="gearbox" value="manual"/>
		Manual Transmission
		<br><br>
		
		Engine:
		<br>
		<form:checkboxes items="${engines}" path="engine"/> 
		<br><br>
		<input type="submit" value="Submit" />
		
	</form:form>
</main>
</body>
</html>
<!--
	<form action="submitData" method="GET">
		<input type="text" name="carBrand" 
			   placeholder="Enter car's brand" >
		<input type="text" name="year" 
			   placeholder="Enter car's year" >
		<input type="text" name="email" 
			   placeholder="Enter your email" >
		<input type="submit" value="Find" >
	</form> 
 -->