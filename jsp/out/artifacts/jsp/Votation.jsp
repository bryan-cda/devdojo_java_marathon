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
<form action="VotationServlets" method="post">
        <div>
            <label>Candidato 1:</label>
            <input type="text" name="candidate1">
        </div>
        <div>
            <label>Candidato 2:</label>
            <input type="text" name="candidate2">
        </div>
        <div>
            <label>Candidato 3:</label>
            <input type="text" name="candidate3">
        </div>
        <div>
            <label>Candidato 4:</label>
            <input type="text" name="candidate4">
        </div>
        <div>
            <label>Candidato 5:</label>
            <input type="text" name="candidate5">
        </div>
    <div>
        <label>Número de votos</label>
        <input type="number" name="votes">
    </div>
        <div>
            <input type="submit" value="Votar"/>
        </div>
    </form>
<jsp:include page="Footer.jsp"/>

</body>
</html>
