<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

<h2>Student Registration Form</h2><hr>

	<form:form action="processForm" modelAttribute="student">
	
		First name: <form:input path="firstName"/> <br/><br/>
		
		Last name:  <form:input path="lastName" /> <br/><br/>
		
		Country:
		<form:select path="country">
		<!--  
			<form:option value="Brazil" label="Brazil" />
			<form:option value="France" label="France" />
			<form:options items="${student.countryOptions}"/>
		-->
			<form:options items="${countries}" />
		</form:select> <br/><br/>
		
		<input type="submit" value="Submit"/> <br/> <br/>
		
	</form:form>

</body>
</html>