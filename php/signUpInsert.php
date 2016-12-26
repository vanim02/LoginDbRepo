<?php

include 'dbconnect.php';
if(isset($_POST['submitSignUp'])){
	
$connect=connect();
if($connect){
	$username=$_POST['username'];
	$firstname=$_POST['firstname'];
	$lastname=$_POST['lastname'];
	$dob=$_POST['dob'];
	$gender=$_POST['gender'];
	$password=$_POST['password'];
	$role=$_POST['role'];
	$parent=$_POST['parent'];
	if(empty($gender)){
		$gender=null;
	}
	$query="insert into signupdetails   (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."','".$role."',null,now(),null);";
	if($role=="child"){

		$query="insert into signupdetails (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."','".$role."','".$parent."',now(),null);";
	}
	
	
	//print($query);
		if($connect->query($query)){
			"<br>".print("Sign Up successful. Wait for the approval from admin. If you think approved, click on login <a href=login.php >Login here</a>");
			
		}else{
			"<br>".print("Sign up failed");
		}
		mysqli_close($connect);
	}else{
		print("db not connected");
	}
}

	
?>
