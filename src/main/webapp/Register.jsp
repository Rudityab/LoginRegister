<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="CSS/LoginRegister.css" rel="stylesheet" type="text/css"/>

<title>Registration Form</title>
</head>
<body>
  <section>
    <div class="container">
      <div class="user signinBx">
        
        <div class="formBx">
          <form action="Loginreg" method="post" >
            <h2>Create an account</h2>
            <input type="text" name="Username" placeholder="Username" />
            <input type="email" name="Email" placeholder="Email Address" />
            <input type="password" name="Password" placeholder="Create Password" />
            <input type="password" name="Confirm Password" placeholder="Confirm Password" />
            <input type="submit" name="submit" value="Register" />
            <p class="signup">
              Already have an account ?
              <a href="Login.jsp" >Sign in.</a>
            </p>
          </form>
        </div>
        <div class="imgBx"><img src="logo.jpg"/></div>
      </div>
      </div>
  </section>
</body>
</body>
</html>