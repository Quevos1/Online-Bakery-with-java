<%-- 
    Document   : dash
    Created on : 08 Nov 2022, 11:11:38 AM
    Author     : TRAIN 11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
              <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
              <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
                <style>
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
                .navbar {
                overflow: hidden;
                background-color: #dea5a4;

                }
                .row.content {height: 550px}
                </style>
                            </head>
                            <body>

        <div class="navbar">
        <a href="login.jsp">Log Out</a>
        <a href="dash.jsp">Home</a>

       </div>
        <u><h1>Dashboard</h1></u>
        <div class="row">
  <div class="col-sm-3">
 <div class="well">
  <u><h4>Clients</h4></u>
  <button><a href="addClient.jsp">Add Client</a></button><br>
  <button><a href="update.jsp">Update Client</a></button><br>
  <button><a href="deleteCustomer.jsp">Delete Client</a></button><br>
  <button><a href="customers.jsp">View all Clients</a></button>
  </div>
  </div>
  <div class="col-sm-3">
      <div class="well">
          <u><h4>Items</h4></u>
  <button><a href="addItem.jsp">Add an Item</a></button><br>
  <button><a href="update.jsp">Update an Item</a></button><br>
  <button><a href="delete.jsp">Delete an Item</a></button><br>
  <button><a href="all_Items.jsp">View all Items</a></button>
          </div>
  </div>
  <div class="col-sm-3">
  <div class="well">
  <u><h4>Orders</h4></u>
 
  <button><a href="">Update an Order</a></button><br>
  <button><a href="">Delete an Order</a></button><br>
  <button><a href="orders.jsp">View all Orders</a></button>
  </div>
  </div>
  <div class="col-sm-3">
            <div class="well">
                <u><h4>Admin</h4></u>
  <button><a href="register.jsp">Add an Admin</a></button><br>
  <button><a href="">Update an Admin</a></button><br>
  <button><a href="">Delete an Admin</a></button><br>
  <button><a href="">View all Admins</a></button>
  </div>
  </div>
  </div>
  <form method="POST">
  
<!--  <a href="all_Items.jsp">View all Items</a>
<button name="All_Customers"> <a href="customers.jsp">View Customers</a></button>
  <a href="orders.jsp">View Orders</a>
  <a href="delete.jsp">Delete an Item</a>
  <a href="update.jsp">Update an Item</a>
<a href="addCategory.jsp">Add Category</a>-->
</form>
</body>
                            </html>
