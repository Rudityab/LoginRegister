<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="CSS/LoginRegister.css" rel="stylesheet" type="text/css"/>

<title>Login Form</title>
</head>
<body>
 <section>
    <div class="container">
      <div class="user signinBx">
      <div class="imgBx"><img src="logo.jpg"/></div>
        
        <div class="formBx">
          <form action="Loginreg" method="post" >
            <tr>
            <td><h3 style="color: red;">${message}</h3>
            <h3 style="color: green;">${successMessage}</h3>
            </td>
            </tr>
            <h2>Sign In</h2>
           
            <input type="text" name="Username" placeholder="Username" />
            <input type="password" name="Password" placeholder="Password" />
            <input type="submit" name="submit" value="Login" />
            <p class="signup">
              Don't have an account ?
              <a href="Register.jsp">Sign Up.</a>
            </p>
          </form>
        </div>
      </div>
      
    </div>
  </section>
</body>
</html>