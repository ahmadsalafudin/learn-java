<%-- 
    Document   : index
    Created on : Nov 7, 2019, 3:06:11 PM
    Author     : ahmad
--%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Login dulu</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
        <style type="text/css">
            .login-form {
                width: 330px;
                margin: 30px auto;
            }
            .login-form h2 {
                font-size: 19px;
                margin-bottom: 15px;
                text-align: center;
            }
            .login-form form {        
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);        
                margin-bottom: 10px;
                padding: 30px;
            }
            .login-form .avatar {
                width: 90px;
                margin-bottom: 20px;
            }
            .login-form .form-control, .login-form .btn {
                min-height: 38px;        
            }
            .login-form input[type="email"] {
                border-radius: 2px 2px 0 0;
            }
            .login-form input[type="password"] {
                border-radius: 0 0 2px 2px;
                margin-top: -1px;
            }
            .login-form input.form-control:focus {
                position: relative;
                z-index: 2;
            }
            .login-form .btn {        
                font-size: 15px;
                font-weight: bold;
                border-radius: 2px;
            }
        </style>
    </head>
    <body>
        <div class="login-form">
            <h2>Register to Your Account</h2>
            <form  method="post" action="prosesRegist.jsp">
                <div class="text-center">
                    <img src="img/batm.png" class="img-circle avatar" alt="Avatar">
                </div>        
                <div class="form-group">
                    <input type="text" name="username" class="form-control" placeholder="Username" required="required">
                    <input type="text" name="email" class="form-control" placeholder="Email" required="required">
                    <input type="password" name="password" class="form-control" placeholder="Password" required="required">
                 
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary btn-block">Register</button>
                </div>
                <div class="clearfix">
                   
                    <a href="login.jsp" class="pull-right">Have Account?</a>
                </div>        
            </form>
            
        </div>
    </body>
</html>                            
