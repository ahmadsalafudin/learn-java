package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Login dulu</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script> \n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .login-form {\n");
      out.write("                width: 330px;\n");
      out.write("                margin: 30px auto;\n");
      out.write("            }\n");
      out.write("            .login-form h2 {\n");
      out.write("                font-size: 19px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .login-form form {        \n");
      out.write("                background: #f7f7f7;\n");
      out.write("                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);        \n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                padding: 30px;\n");
      out.write("            }\n");
      out.write("            .login-form .avatar {\n");
      out.write("                width: 90px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("            }\n");
      out.write("            .login-form .form-control, .login-form .btn {\n");
      out.write("                min-height: 38px;        \n");
      out.write("            }\n");
      out.write("            .login-form input[type=\"email\"] {\n");
      out.write("                border-radius: 2px 2px 0 0;\n");
      out.write("            }\n");
      out.write("            .login-form input[type=\"password\"] {\n");
      out.write("                border-radius: 0 0 2px 2px;\n");
      out.write("                margin-top: -1px;\n");
      out.write("            }\n");
      out.write("            .login-form input.form-control:focus {\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("            .login-form .btn {        \n");
      out.write("                font-size: 15px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                border-radius: 2px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"login-form\">\n");
      out.write("            <h2>Sign in to Your Account</h2>\n");
      out.write("            <form  method=\"post\" action=\"login.jsp\">\n");
      out.write("                <div class=\"text-center\">\n");
      out.write("                    <img src=\"img/batm.png\" class=\"img-circle avatar\" alt=\"Avatar\">\n");
      out.write("                </div>        \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" placeholder=\"Email\" required=\"required\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\">\n");
      out.write("                    <label class=\"pull-left checkbox-inline\"><input type=\"checkbox\"> Remember me</label>\n");
      out.write("                    <a href=\"#\" class=\"pull-right\">Forgot Password?</a>\n");
      out.write("                </div>        \n");
      out.write("            </form>\n");
      out.write("            <p class=\"text-center\"><a href=\"registrasi.jsp\">Create an Account</a></p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>                            \n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
