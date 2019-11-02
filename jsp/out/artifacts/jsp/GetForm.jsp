<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Get Form to App Resquests</title>  
  </head>
  <body>
  <!-- Instance of Credentials Bean -->
  <jsp:useBean id="Credentials" class="beans.Authentication" type="beans.Authentication" scope="page"></jsp:useBean>
  <!--Set the value of class in HTTP post method -->
  <jsp:setProperty name="Credentials" property="*"></jsp:setProperty>
  <jsp:getProperty name="Credentials" property="user"/>
  <jsp:getProperty name="Credentials" property="password"/>



  <% String user = Credentials.getUser(); %>
    
    <!--Get user and password to validate access -->
    <% String password = request.getParameter("password"); %>
    
    <% if(param.user.equalsIgnoreCase("bryan.duarte") &&
    Credentials.getPassword().equalsIgnoreCase("123"))
    {
      response.sendRedirect("Votation.jsp");
    } else{
        response.sendRedirect("/jsp");
    }%>

    <b><h2>Context:</h2></b>
    <!-- show the context that you're in -->
    <%= request.getContextPath() %>

    <p></p>


  </body>
</html>
