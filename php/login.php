
<html>
<head>
<title> Login Page</title>
</head>
<body>
<h3> Login </h3>
	<form name="loginform" method="POST" action="loginValidation.php">
		Username: <input type="text" id="loginuser" name="username" ></input><br>
		Password: <input type="password" id="loginpass" name="password" ></input><br>

		Login As (Role):   <select name="role">
								<option >Select</option>
								<option >Teacher</option>
								<option >Parent</option>
							</select><br>
		<input type="submit" name="submitlogin" id="login" value="Login"></input>
	</form>
</body>
</html>