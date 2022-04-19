<%-- 
    Document   : login
    Created on : Nov 7, 2019, 3:21:39 PM
    Author     : ahmad
--%>

<%@ page import ="java.sql.*" %>

<%
    String userid = request.getParameter("username");
    String pass = request.getParameter("password");
    
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
            + "batm", "root", "");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from user where username='" + userid + "' or email='"+userid+"' "
            + "and password='" + pass + "'");
    
    if (rs.next()) {
        session.setAttribute("username", rs.getString("username"));
        session.setAttribute("email", rs.getString("email"));
        response.sendRedirect("home.jsp");

    } else {
        response.sendRedirect("index.jsp");
    }
%>