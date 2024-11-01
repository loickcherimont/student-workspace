<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>My Student Workspace</title>
    </head>
    <body>
        <h1>Students</h1>
        <p>There are <span style="color:red;">${students.all.size()}</span> student${students.all.size()> 1 ? "s":""} in this class.</p>
        <%@ include file="header.jsp" %>
        <table>
            <tr>
                <c:forTokens items="id/firstname/lastname/email/phonenumber/age" delims="/" var="property">
                    <th>${property}</th>
                    </c:forTokens>
            </tr>

            <c:forEach items="${students.all}" var="student" varStatus="s">
                <tr class="student${student.id}">
                    <td>${student.id}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td> 
                    <td>${student.email}</td> 
                    <td>${student.phoneNumber}</td>
                    <td>${student.age}</td>
                    <td><button type="button">Delete</button></td>
                    ${s}
                </tr>
            </c:forEach>
        </table>

        <form method="POST" action="students">
            <label for="firstName">First name: </label>
            <input type="text" id="firstName" name="firstName"/>
            <br />
            <label for="lastName">Last name: </label>
            <input type="text" id="lastName" name="lastName"/>
            <br />
            <label for="email">E-mail: </label>
            <input type="email" id="email" name="email"/>
            <br />
            <label for="phoneNumber">Phone number: </label>
            <input type="tel" id="phoneNumber" name="phoneNumber"/>
            <br />
            <label for="age">Age: </label>
            <input type="text" id="age" name="age"/>
            <br />
            <input type="submit" />
        </form>

    </body>
</html>
