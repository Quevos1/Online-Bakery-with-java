<%-- 
    Document   : bread
    Created on : 02 Nov 2022, 11:10:38 AM
    Author     : TRAIN 11
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="co.za.mecer.connection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>JSP Page</title>
        <style>
html {
    scroll-behavior: smooth;
}
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #dea5a4;

}
body {
  background-image: url("pexels-photo-2088170.webp");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
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
div.cakes {
  margin: 5px;
  border: 1px solid #ccc;
  float: left;
  width: 180px;
}

div.cakes:hover {
  border: 1px solid #777;
}

div.cakes img {
  width: 100%;
  height: auto;
}

div.desc {
  padding: 15px;
  text-align: center;
}
</style>
    </head>
    <body>
         <div class="navbar">
             <a href="index.jsp">Home</a>
  
  <div class="dropdown">
    <button class="dropbtn">Products
      <i class="fa fa-caret-down"></i>
    </button>

    <div class="dropdown-content">
        <a href="cakes.jsp">Cakes</a>
        <a href="pastry.jsp">Pastry</a>
        <a href="cookies.jsp">Cookies</a>
     
      
    </div>
  </div> 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a>
  <a href="">About Us</a> 
  <a href="aboutUs.jsp"><i class="fa fa-fw fa-envelope"></i> Contact</a>
   <a href="login.jsp"><i class="fa fa-shopping-cart"></i> Cart</a>
</div>
        <h1>Hello I am bread page</h1>
        
  <% 
            ResultSet rs = DBConnection.getInstance().createStatement().executeQuery("SELECT * FROM bread");
            while(rs.next()){
                
            
        %>
      <div class="cakes">
  <a target="_blank">
      
      <a href="bread_jsp/<%=rs.getString(2)+".jsp"%>"><img src="bread/<%=rs.getString("Name")+".jpeg"%>" alt="Cinque Terre" width="600" height="400"></a>
  </a>
  <div class="desc">From R20.00</div>
      </div>
  <%}%>
        
        
    </body>
</html>
