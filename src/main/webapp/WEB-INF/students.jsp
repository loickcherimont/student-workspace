<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Student Workspace</title>
    </head>
    <body>
        <h1>Students</h1>
        <%@include file="header.jsp" %>
        <p></p>
       <%-- 
How to create the code below using EL

<ul>
            <h2>${student.getFirstName()} ${student.getLastName().toUpperCase()}</h2>
            <li>Email: ${student.getEmail()}</li>
            <li>Phone: ${student.getPhoneNumber()}</li>
            <li>Age: ${student.getAge()}</li>
        </ul>
--%>

    </body>
</html>
