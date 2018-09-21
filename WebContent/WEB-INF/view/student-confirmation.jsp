<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<h2>Confirmation</h2> <hr>
	
	The student is confirmed: ${student.firstName} 
						      ${student.lastName} 
	<br>			
			      
	The country is:		      ${student.country}
	<br>
	
	His/her favourite programming language is: ${student.favouriteLanguage}
	<br>
	
	Acquainted with:
	<ul>
		<c:forEach var="systemName" items="${student.operatingSystems}">
			<li> ${systemName} </li>
		</c:forEach>
	</ul>
	
</body>
</html>