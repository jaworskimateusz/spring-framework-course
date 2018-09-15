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
	<form action="submitData" method="GET">
		<input type="text" name="carBrand" 
			   placeholder="Enter car's brand" >
		<input type="text" name="year" 
			   placeholder="Enter car's year" >
		<input type="text" name="email" 
			   placeholder="Enter your email" >
		<input type="submit" value="Find" >
	</form>
</main>
</body>
</html>