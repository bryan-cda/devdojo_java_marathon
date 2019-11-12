<%@ page import="beans.Candidates" %><%--
  Created by IntelliJ IDEA.
  User: bryan
  Date: 02/11/2019
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>



<!--header -->
<jsp:useBean id="Candidates" class="beans.Candidates" type="beans.Candidates" scope="page"></jsp:useBean>
<jsp:useBean id="Votation" class="servlets.VotationServlets" type="servlets.VotationServlets" scope="page"></jsp:useBean>
<jsp:getProperty name="Votation" property="winner"/>
<div>
    <jsp:include page="Header.jsp"/>
    <link rel="stylesheet" href="style/style.css">
</div>
<head>
    <title>Resultado das Eleições</title>
</head>
<body>
<c:out value="dfsdfdssdf" />

</body>
