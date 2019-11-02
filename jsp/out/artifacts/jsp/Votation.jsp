<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadidates</title>
</head>
<body>
<jsp:useBean id="Credentials" class="beans.Authentication" type="beans.Authentication" scope="page"></jsp:useBean>
<jsp:setProperty name="Credentials" property="user"/>
<jsp:include page="Header.jsp"/>
<br>
<form action="#" method="post">
        <div>
            <label>Candidato 1:</label>
            <input type="text" value="${param.user}">
        </div>
        <div>
            <label>Candidato 2:</label>
            <input type="text" value="${param.password}">
        </div>
        <div>
            <label>Candidato 3:</label>
            <input type="text">
        </div>
        <div>
            <label>Candidato 4:</label>
            <input type="text">
        </div>
        <div>
            <label>Candidato 5:</label>
            <input type="text">
        </div>
        <div>
            <input type="submit" value="Votar"/>
        </div>
    </form>
<jsp:include page="Footer.jsp"/>

</body>
</html>
