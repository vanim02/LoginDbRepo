<html>
<head>
<title> Add child</title>

</head>

<body>
<?php
	include 'dbconnect.php';
	if(isset($_POST['addchild'])){
		$username=$_POST['username'];
	$firstname=$_POST['firstname'];
	$lastname=$_POST['lastname'];
	$dob=$_POST['dob'];
	$gender=$_POST['gender'];
	$password=$_POST['password'];

		
		session_start();
	$connect=connect();
		if($connect){
			if(empty($gender)){
				$gender=null;
			}
			$query="insert into signupdetails (username, firstname, lastname, dateofbirth, gender, password, role, parent, signupdate, decision) values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."','child','".$_SESSION['inputuser']."',now(),null)";
			print($query);
			$result=$connect->query($query);
			if($result){
				print("Deleted child successfully");
				header('Location:parentPage.php');
			}else{
				print("Could not add child");
			}
			mysqli_close($connect);
		}else if($connect->connect_error){
			print("connection failure");
		}
		
	}
?>

<h3> Add Child </h3>
<form name="signup" method="POST" action="addChild.php">
First name: * <input type="text" id="firstname" name="firstname" required="true"></input><br>
Last name: * <input type="text" id="lastname" name="lastname" required="true"></input><br>
Date of Birth: * <input type="text" id="dob" name="dob" required="true"></input><br>
Gender:   <input type="radio" id="gender" name="gender" value="male" ></input> Male <input type="radio" id="gender" name="gender" value="female"></input> Female<br>

Username: * <input type="text" id="username" name="username" required="true"></input><br>
Password: * <input type="password" id="password"  name="password" required="true"></input><br>

 <input type="submit" id="submit" name="addchild" onClick="addChild.php"></input>
 <input type="button" id="cancel" name="cancel" value="cancel" onClick="window.open('addChild.php','_self')"></input>
</form>

</body>

</html>
