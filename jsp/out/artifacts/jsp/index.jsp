<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="Credentials" class="beans.Authentication" type="beans.Authentication" scope="page"></jsp:useBean>
<jsp:useBean id="ShowRandomNumber" class="beans.ShowRandomNumber" type="beans.ShowRandomNumber" scope="page"></jsp:useBean>
<html>
  <style>
    #login {
      margin: 450px;
      margin-top: 100px;
    }
    input {
      width: 350px;
    }
    body {
      background-image: url("images/rj.png");
    }
  </style>
  <body>
    <!--header -->
    <div>
      <jsp:include page="Header.jsp"/>
    </div>
    <hr>
    <form action="Controller" method="post" id="login">
      <div id="user">
        <label>
          <b>Digite seu usuário: </b>
        </label>
        <input type="text" id="inputuser" name="user" placeholder="user@example.com"/>
      </div>
      <div id="password">
        <label>
          <b>Digite sua senha: </b>
        </label>
      <br>
        <input type="text" id="inputpassword" name="password" placeholder="**********"/>
      </div>
      <div>
        <input type="submit" value="logar"/>
      </div>
    </form>
    <!--Include JSP Footer component -->
    <jsp:include page="Footer.jsp"/>
</body>
  <!--Scripts JS -->
  <script>
    function setTime() {
      var date = new Date();
      var h = date.getHours();
      var m = date.getMinutes();
      var s = date.getSeconds();

      if(h < 10) {
        h = '0'+h;
      }
      if(m < 10) {
        m = '0'+m;
      }
      if(s < 10) {
        s = '0'+s;
      }

      var time = (h+':'+m+':'+s);
      var clk = document.getElementById('clock').value = time;
    }

    setInterval(setTime,1000);

  </script>
</html>
