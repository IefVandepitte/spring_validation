<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <spring:bind path="numbers.amount">
            ${status.value}
        </spring:bind><br>
        <spring:bind path="numbers.number1">
            ${status.value}
        </spring:bind><br>
        <spring:bind path="numbers.number2">
            ${status.value}
        </spring:bind>
    </body>
</html>
