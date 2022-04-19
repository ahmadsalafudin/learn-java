<%-- 
    Document   : home
    Created on : Nov 7, 2019, 3:14:47 PM
    Author     : ahmad
--%>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body> 
        <% 
            if (session.getAttribute("username") ==null) {
                response.sendRedirect("login.jsp");
            }
        %>
        <h1> Hello <%= session.getAttribute("username")%> </h1>
        <h1> Hello <%= session.getAttribute("email")%> </h1>
        <a href="login.jsp" <% session.invalidate(); %> >Logout</a>
    </body>
</html>
