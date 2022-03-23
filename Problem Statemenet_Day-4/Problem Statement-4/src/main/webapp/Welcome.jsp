<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   

    <%@page import="com.bookstore.entity.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
    
    
    <%
    
    	User user=(User)session.getAttribute("currentUser");
    	if(user==null){
    	response.sendRedirect("Login.jsp");
    	}

    
    %>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Books Records</title>
</head>
<body bgcolor="yellow">
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/BookStore"
        user="Admin" password="Sweety@123"
    />
    <style>
      #logout {
     
     color: red;
     padding-right: 20px;
     font-size: 30px
    }
    </style>
    <sql:query var="booklist"   dataSource="${myDS}">
        SELECT * FROM books;
    </sql:query>
     <div align="right"> 
        <a id="logout" href="LogoutServlet">Logout</a>
	</div>
    <div align="center">
        <h1>CUSTOMER CART FOR ONLINE BOOK SHOP</h1>
          <h2>List of Books</h2>
        
            <table border="1" width="30%" cellpadding="5" bgcolor="white" style="color:black">
            <tr>
                  <th colspan="4"><br>Books <br><br></th>
            
            </tr>
            <tr>
                <th> Book ID </th>
                <th> Book Name </th>
                <th> Author </th>
                <th> Price </th>
            </tr>
            <c:forEach var="Books" items="${booklist.rows}">
                <tr style="text-align:center">
                    <td><a href=""><c:out value="${Books.Book_Id}" /></a></td>
                    <td><c:out value="${Books.Book_Name}" /></td>
                    <td><c:out value="${Books.Author}" /></td>
                    <td><c:out value="${Books.Price}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>