<%-- 
    Document   : prosesRegist
    Created on : Nov 8, 2019, 4:46:14 PM
    Author     : ahmad
--%>

<%@ page import ="java.sql.*" %>
<%
    String user = request.getParameter("username");    
    String pass = request.getParameter("password");
    String email = request.getParameter("email");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batm",
            "root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into user( username, email, password) values ('" + user + "','" + email + "','" + pass + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("index.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("registrasi.jsp");
    }
%>
