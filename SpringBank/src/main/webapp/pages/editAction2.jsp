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
<form:form  action="editAccount"  modelAttribute="editAccForm">

	<table>
	<%-- <tr>
		 
		<td><form:hidden path="corporateid" /></td> 
	</tr> --%>
	<tr>
		<td><form:label path="accountnumber">Account Number</form:label></td>
		<td><form:input path="accountnumber" /></td> 
	</tr>
	<tr>
		<td><form:label path="accountname">Account Name</form:label></td>
		<td><form:input path="accountname" /></td> 
	</tr>
	
		<tr>
		<td><form:label path="currency">Currency</form:label></td>
		<td><form:input path="currency" /></td> 
	   </tr>
	
	<tr>
		<td><form:label path="branch">Branch</form:label></td>
		<td><form:input path="branch" /></td> 
		</tr>
		<tr>
		<td><form:label path="availablebalance">Available Balance</form:label></td>
		<td><form:input path="availablebalance" /></td> 
	</tr>
	
	<tr>
		<td><form:label path="openingbalance">Opening Balance</form:label></td>
		<td><form:input path="openingbalance" /></td> 
	</tr>
	<tr>
		<td><form:label path="closingbalance">Closing Balance</form:label></td>
		<td><form:input path="closingbalance" /></td> 
	</tr>
	<tr>
		<td><form:label path="creditdetails">Credit Details</form:label></td>
		<td><form:input path="creditdetails" /></td> 
	</tr>
	<tr>
		<td><form:label path="debitdetails">Debit Details</form:label></td>
		<td><form:input path="debitdetails" /></td> 
	</tr>
	<tr>
		<td><form:label path="corporateid">Corporate Id</form:label></td>
		<td><form:input path="corporateid" /></td> 
	</tr>
	
	
	
	

	
	<tr>
		<td colspan="2">
			<input type="submit" value="Edit Account"/>
		</td>
	</table>
	</form:form>
</body>
</html>