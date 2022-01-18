<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 
<form:form  action="addUser" modelAttribute="usr" method="post">

<table>
	 
	<tr>
		<td><form:label path="username">User Name</form:label></td>
		<td><form:input path="username" /></td> 
	</tr>
	
	<tr>
		<td><form:label path="department">Department</form:label></td>
		<td><form:input path="department" /></td> 
	</tr>
	<tr>
		<td><form:label path="address">Address</form:label></td>
		<td><form:input path="address" /></td> 
	</tr>
	<tr>
		<td><form:label path="phonenumber">Phone Number</form:label></td>
		<td><form:input path="phonenumber" /></td> 
	</tr>
	<tr>
		<td><form:label path="corporateid">CorporateId</form:label></td>
		<td><form:input path="corporateid" /></td> 
	</tr>
	<tr>
	
	<td colspan="2">
			<input type="submit" value="Add User"/>
		</td>
	</tr>
	 		 
			 
		 
	</table>
	 

</form:form>
</body>
</html>