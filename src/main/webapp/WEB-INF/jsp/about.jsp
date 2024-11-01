<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>My Student Workspace</title>
    </head>
    <body>
        <h1>About</h1>
        <%@include file="header.jsp" %>

        <ul class="contact">
            <c:forTokens items="univ.fb.com|univ.instagram.com|linkedin.com/in/univ|univ.youtube.com" delims="|" var="contact" varStatus="stat">
                <li>${contact}</li>     
            </c:forTokens>
        </ul>

    </body>
</html>
