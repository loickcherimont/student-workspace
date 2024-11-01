<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>My Student Workspace</title>
    </head>
    <body>
        <h1>Form</h1>
        <%@include file="header.jsp" %>
        
        <c:if test="${!empty form.result}">
            <p><c:out value="${form.result}">Result will appear here...</c:out></p>
        </c:if>
        <form method="POST" action="/StudentWorkspace/form">
            <label for="login">Login: </label>
            <input type="text" id="login" name="login" />
            <br/>
            <label for="pass">Password:</label>
            <input type="password" id="pass" name="pass" />
            
            <input type="submit" />
        </form>

    </body>
</html>