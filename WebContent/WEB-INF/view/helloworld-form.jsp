<!DOCTYPE html>
<html>
<head>
	<title>HTML form</title>
	<link rel="stylesheet" type="text/css"           
		  href="${pageContext.request.contextPath}/resources/css/style.css">
	<link rel="icon" type="image/jpg"
		  href="${pageContext.request.contextPath}/resources/images/spring-logo.png" >
</head>
<body>

	<form action="processFormThree" method="GET">
		<input type="text"
			   name="studentName"
			   placeholder="What's your name?">
		<input type="submit">
	</form>

</body>
</html>