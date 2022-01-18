<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
<html>
    <head>
        <title>SELECT Operation</title>
        
    </head>
    <body>
 
        
        <form>
            <table border="1" width="40%">
                <caption>Account List</caption>
                <tr>
                    <th>Account Number</th>
                    <th>Account Name Name</th>
                    
                    <th>Currency</th>
                    <th>Branch</th>
                    <th>Available Balance</th>
                    <th>Opening Balance</th>
                    <th>Closing Balance</th>
                    <th>Credit Details</th>
                    <th>Debit Details</th>
                    <th>Corporate Id</th>
                    
                    <th colspan="2">Action</th>
                </tr>
              <c:forEach var="row" items="${list}">   
                    <tr>
                        <td><c:out value="${row.accountnumber}"/></td>
                        <td><c:out value="${row.accountname}"/></td>
                         
                          <td><c:out value="${row.currency}"/></td>
                            <td><c:out value="${row.branch}"/></td>
                            <td><c:out value="${row.availablebalance}"/></td>
                            <td><c:out value="${row.openingbalance}"/></td>
                            <td><c:out value="${row.closingbalance}"/></td>
                            
                            <td><c:out value="${row.creditdetails}"/></td>
                            <td><c:out value="${row.debitdetails}"/></td>
                            <td><c:out value="${row.corporateid}"/></td>
                             
                      <td><a href="editAcc?accountnumber=<c:out value="${row.accountnumber}"/>">Update</a></td>
                    <%--     <td><a href= "EmployeeServlet?id=<c:out value="${row.id}"/>&action=delete">Delete</a></td> --%>
                     <td><a href="deleteAcc/${row.accountnumber}">Delete</a></td>      
                    </tr>
                </c:forEach>
            </table>
        </form>
       <a href="addAccountForm">Create New Account</a>  
    
</body>
</html>