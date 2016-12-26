
<html>
<head>
<title> Login Page</title>
</head>
<body>
<h3> Login Page </h3>
	<form name="loginform" method="POST" action="loginValidation.php">
		Username: * <input type="text" id="loginuser" name="username" required="true"></input><br>
		Password: * <input type="password" id="loginpass" name="password" required="true"></input><br>

		Login As (Role): *   <select name="role" required="true">
								<option value="">Select</option>
								<option value="teacher" >Teacher</option>
								<option value="parent">Parent</option>
							</select><br>
		<input type="submit" name="submitlogin" id="login" value="Login"></input>
	</form>
</body>
</html>
