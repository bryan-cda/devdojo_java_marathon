<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="Credentials" class="beans.Authentication" type="beans.Authentication" scope="page"></jsp:useBean>
<jsp:useBean id="ShowRandomNumber" class="beans.ShowRandomNumber" type="beans.ShowRandomNumber" scope="page"></jsp:useBean>
<html>
  <body>
  <!--header -->
  <div>
    <jsp:include page="Header.jsp"/>
  </div>
  <hr>

  <form action="Controller" method="post">
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
    </form>
  <jsp:include page="Footer.jsp"/>
  </body>
</html>
