<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <c:choose>
            <c:when test="${empty param.nombre}">Par&aacute;metro &lsquo;nombre&rsquo; no definido.</c:when>
            <c:otherwise>
                Valor del par&aacute;metro &lsquo;nombre&rsquo;:
                ${param.nombre}
            </c:otherwise>
        </c:choose>
    </body>
</html>