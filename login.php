<html>
<head>
<title> Login</title>
<?php
$enteredusername=$_post['username'];
print($enteredusername);

?>
</head>
<body>
<h3> Login </h3>
<form name="loginform" method="post" action="login.php">
Username: <input type="text" id="loginuser" name="username" ></input><br>
Password: <input type="text" id="loginpass"  ></input><br>
Login As:   <select>
<option >Select</option>
<option >Teacher</option>
<option >Parent</option>
	</select><br>
 <input type="submit" name="submitlogin" id="login" value="Login"></input>
</form>
</body>
</html>