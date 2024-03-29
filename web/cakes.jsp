<%-- 
    Document   : cakes
    Created on : 02 Nov 2022, 11:10:24 AM
    Author     : TRAIN 11
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="co.za.mecer.connection.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
    
body {
  font-family: Arial, Helvetica, sans-serif;
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
body{
    background-image: url("pexels-photo-2088170.webp");
}
    
.navbar {
  overflow: hidden;
  background-color: #dea5a4;

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

.container {
  position: relative;
  width: 190px;
  height: 150px;
}

.image {
  display: block;
  
}

.overlay {
  position: absolute;
  top: 0;
  bottom: 0;
  left: 0;
  right: 0;
  height: 100%;
  width: 100%;
  opacity: 0;
  transition: .5s ease;
  background-color: #008CBA;
}

.container:hover .overlay {
  opacity: 1;
}

.text {
  color: white;
  font-size: 20px;
  position: absolute;
  top: 50%;
  left: 50%;
  -webkit-transform: translate(-50%, -50%);
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
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
        <a href="pastry.jsp">Pastry</a>
        <a href="cookies.jsp">Cookies</a>
        <a href="bread.jsp">Bread</a>
      
    </div>
  </div> 
  <a href="login.jsp"><i class="fa fa-fw fa-user"></i> Login</a>
  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a>
  <a href="">About Us</a> 
  <a href="aboutUs.jsp"><i class="fa fa-fw fa-envelope"></i> Contact</a>
   <a href="login.jsp"><i class="fa fa-shopping-cart"></i> Cart</a>
</div>

    



<% 
            ResultSet rs = DBConnection.getInstance().createStatement().executeQuery("SELECT * FROM cakes");
            while(rs.next()){
                
            
        %>
      <div class="cakes">
  <a target="_blank">
      
      <a href="cakes_jsp/<%=rs.getString(2)+".jsp"%>"><img src="cakes//<%=rs.getString("Name")+".jpg"%>" width="600" height="400"></a>
  </a>
  <div class="desc">From R20.00</div>
      </div>
  <%}%>
</body>
</html>
