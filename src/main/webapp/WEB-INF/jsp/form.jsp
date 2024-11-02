<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>My Student Workspace</title>
    </head>
    <body>
        <h1>Form</h1>
        <nav>
            <a href="/StudentWorkspace/">Home</a>
        </nav>
        
<%--        <c:if test="${!empty form.result}">
            <p><c:out value="${form.result}">Result will appear here...</c:out></p>
        </c:if>--%>
        <form method="POST" action="form">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" />
            <br/>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" />
            
            <input type="submit" />
        </form>

    </body>
</html>