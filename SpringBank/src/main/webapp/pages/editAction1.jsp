<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form  action="editCorporate"  modelAttribute="editCorForm">

	<table>
	<%-- <tr>
		 
		<td><form:hidden path="corporateid" /></td> 
	</tr> --%>
	<tr>
		<td><form:label path="corporateid">Corporate id</form:label></td>
		<td><form:input path="corporateid" /></td> 
	</tr>
	<tr>
		<td><form:label path="corporatename">Corporate Name</form:label></td>
		<td><form:input path="corporatename" /></td> 
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
		<td colspan="2">
			<input type="submit" value="Edit Corporate"/>
		</td>
	</table>
	</form:form>
</body>
</html>