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
                <caption>Corporate List</caption>
                <tr>
                    <th>Corporate ID</th>
                    <th>Corporate Name</th>
                    
                    <th>Address</th>
                    <th>PhoneNumber</th>
                    
                    <th colspan="2">Action</th>
                </tr>
              <c:forEach var="row" items="${list}">   
                    <tr>
                        <td><c:out value="${row.corporateid}"/></td>
                        <td><c:out value="${row.corporatename}"/></td>
                         
                          <td><c:out value="${row.address}"/></td>
                            <td><c:out value="${row.phonenumber}"/></td>
                             
                      <td><a href="editCor?corporateid=<c:out value="${row.corporateid}"/>">Update</a></td>
                    <%--     <td><a href= "EmployeeServlet?id=<c:out value="${row.id}"/>&action=delete">Delete</a></td> --%>
                     <td><a href="deleteCor/${row.phonenumber}">Delete</a></td>      
                    </tr>
                </c:forEach>
            </table>
        </form>
       <a href="addCorporateForm">Register New Corporate</a>  
    
</body>
</html>