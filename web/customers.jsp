<%-- 
    Document   : customers
    Created on : 08 Nov 2022, 2:04:00 PM
    Author     : TRAIN 11
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="co.za.mecer.connection.DBConnection"%>
<%@page import="co.za.mecer.client.Customer"%>
<%@page import="co.za.mecer.dao.RegisterDAOImpl"%>
<%@page import="co.za.mecer.service.RegisterImpl"%>
<%@page import="co.za.mecer.service.RegisterService"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
                .navbar a {
  float: left;
  font-size: 16px;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;

}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
.navbar {
  overflow: hidden;
  background-color: #dea5a4;

}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dea5a4;
}
body {
  background-image: url("pexels-photo-2088170.webp");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>
</head>
<body>
<div class="navbar">
            <a href="login.jsp">Log Out</a>
            <a href="dash.jsp">Home</a>
  
        </div>
    
    
    <u><h2>Customers</h2></u>

<table>
  <tr>
      <th>ID</th>
    <th>Name</th>
    <th>Surname</th>
    <th>ID</th>
    <th>Email Address</th>
    <th>Phone</th>
    <th>Password</th>
  
  </tr>
  <%
  
            ResultSet rs = DBConnection.getInstance().createStatement().executeQuery("SELECT * FROM client");
            while(rs.next()){
                
            
       
        %>
  <tr>
      <td><%=rs.getString("Client_Id")%></td>
    <td><%=rs.getString("First_Name") %></td>
    <td><%=rs.getString("Surname") %></td>
    <td><%=rs.getString("Id_Number") %></td>
    <td><%=rs.getString("Email_Address") %></td>
    <td><%=rs.getString("Phone") %></td>
    <td><%=rs.getString("User_Password") %></td>
  </tr>
  <tr>
    <%}%>
  
</table>

</body>
</html>


