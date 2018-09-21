<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

<h2>Student Registration Form</h2><hr>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName"/> <br><br>
		
		Last name:  <form:input path="lastName" /> <br><br>
		
		Country:
		<form:select path="country">
			<form:option value="none" >---</form:option>
			<form:options items="${countries}" />
		</form:select> <br><br>
		
		Favourite programming language:
		<br>
		<form:radiobutton path="favouriteLanguage" value="Java"/>Java 
		<form:radiobuttons path="favouriteLanguage" items="${student.languageOptions}" />
		<br><br>
		
		Which Operating Systems do you have experience with?
		<br>
		<form:checkbox path="operatingSystems" value="Linux"/> Linux 
		<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS 
		<form:checkbox path="operatingSystems" value="MS Windows"/> MS Windows 
		
		<br><br>
		<input type="submit" value="Submit"/> 
		
	</form:form>

</body>
</html>