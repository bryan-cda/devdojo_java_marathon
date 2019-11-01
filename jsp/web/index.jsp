<%--
  Created by IntelliJ IDEA.
  User: bryan
  Date: 26/10/2019
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>TRE</title>
    <link rel="stylesheet" type="text/css" href="style/style.css">
  </head>
  <body>
  <!--header -->
  <header>
    <div id="header">
      <h1 id="title"><b>Tribunal Regional Eleitoral da Bucareste - Romênia</b></h1>
    </div>
  </header>
  <jsp:include page="Logo.jsp"/>
  <jsp:useBean id="ShowRandomNumber" class="beans.ShowRandomNumber" type="beans.ShowRandomNumber" scope="page"></jsp:useBean>
  <%=ShowRandomNumber.getRandomNumber(5L)%>

  <br>
  <% out.print("Bem vindo! (a)"); %>
  <hr>

  <form action="GetForm.jsp">
    <div id="user">
      <label>
        <b>Digite seu usuário: </b>
      </label>
      <input type="text"  name="user" placeholder="type your user"/>
    </div>
    <div id="password">
      <label>
        <b>Digite sua senha: </b>
      </label>
      <br>
      <input type="text"  name="password" placeholder="type your password"/>
    </div>
    <div>
      <input type="submit" value="logar"/>
    </div>
    <div>
      <%@ page import="java.util.Date"%>
      <%= "data atual: "+ new Date()%>
    </div>

<%--      <%! int i = 2;--%>
<%--      public int getNumber(){--%>
<%--          return i +=i;--%>
<%--        } %>--%>
<%--      <h1><%=getNumber()%></h1>--%>
    </form>
  </body>
</html>
