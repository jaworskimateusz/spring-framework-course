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
Welcome in world of Spring!

<img src="${pageContext.request.contextPath}/resources/images/spring-logo.png"> 
The message: ${textUpper} <br>
Message to lower: ${message}

<!-- Student name: ${param.studentName}  -->

</body>
</html>