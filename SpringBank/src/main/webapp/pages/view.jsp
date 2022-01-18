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
                <caption>User List</caption>
                <tr>
                    <th>User ID</th>
                    <th>User Name</th>
                    <th>Department</th>
                    <th>Address</th>
                    <th>PhoneNumber</th>
                    <th>CorporateId</th>
                    <th colspan="2">Action</th>
                </tr>
              <c:forEach var="row" items="${list}">   
                    <tr>
                        <td><c:out value="${row.userid}"/></td>
                        <td><c:out value="${row.username}"/></td>
                         <td><c:out value="${row.department}"/></td>
                          <td><c:out value="${row.address}"/></td>
                            <td><c:out value="${row.phonenumber}"/></td>
                             <td><c:out value="${row.corporateid}"/></td>
                      <td><a href="editUsr?userid=<c:out value="${row.userid}"/>">Update</a></td>
                    <%--     <td><a href= "EmployeeServlet?id=<c:out value="${row.id}"/>&action=delete">Delete</a></td> --%>
                     <td><a href="deleteUsr/${row.userid}">Delete</a></td>      
                    </tr>
                </c:forEach>
            </table>
        </form>
       <a href="addUserForm">Register New User</a>  
    
</body>
</html>