<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Get Form to App Resquests</title>  
    <style>

    </style>
  </head>
  <body>

  <% String user = request.getParameter("user"); %>
    
    <!--Get user and password to validate access -->
    <% String password = request.getParameter("password"); %>
    
    <% if(user.equalsIgnoreCase("bryan.duarte") && 
    password.equalsIgnoreCase("123"))
    {
      out.println("Welcome");
    } else{
        response.sendRedirect("/jsp");
    }%>

    <b><h2>Context:</h2></b>
    <!-- show the context that you're in -->
    <%= request.getContextPath() %>


  </body>
</html>
