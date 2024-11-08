<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<html>
    <head>
        <title>OnSys ERP Cloud - v3.00.000</title>
        <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
        <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/resources/imagens/onsys/favicon.ico"/>" />        
        <style>
            html,body,div,iframe{height:100%;}
            div{position:relative;overflow:hidden;}
            iframe{border:none;width:100%;}
            body{margin:0;padding:0;overflow: hidden;}
        </style>
    </head>
    <body>        
        <iframe src="<c:url value="/login.faces"/>" width="100%" height="100%" style="border: 0px;"/>
    </body>
</html>