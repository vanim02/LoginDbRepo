<html>
<head>
<title> Sign up</title>
<Script language="javascript">
function getParent(){
	
	if(document.getElementById('role').value=="child"){
		
		document.getElementById('parent').style.display = 'block';
	}else{
		document.getElementById('parent').style.display = 'none';
	}
}
</script>
</head>

<body>
<h3> Sign up </h3>
<form name="signup" method="POST" action="signUpInsert.php">
First name: <input type="text" id="firstname" name="firstname"></input><br>
Last name: <input type="text" id="lastname" name="lastname"></input><br>
Date of Birth: <input type="text" id="dob" name="dob"></input><br>
Gender:   <input type="radio" id="gender" name="gender" value="male"></input> Male <input type="radio" id="gender" name="gender" value="female"></input> Female<br>

Username: <input type="text" id="username" name="username" ></input><br>
Password: <input type="password" id="password"  name="password"></input><br>
Sign Up as (Role) :  <select name="role" id="role" onChange="getParent(this);">
<option >Select</option>
<option value="child">child</option>
<option value="teacher">teacher</option>
<option value="parent">parent</option>
</select><br>
<div id="parent" style="display:none">
Parent <input type = "text" id="parent" name="parent"></input><br>
</div>
 <input type="submit" id="submit" name="submitSignUp"></input>
</form>

</body>

</html>