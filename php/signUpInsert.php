<?php


if(isset($_POST['submitSignUp'])){
	$connect= mysqli_connect("127.0.0.1","root","1234","logindb");
if($connect){
	
	$username=$_POST['username'];
	$firstname=$_POST['firstname'];
	$lastname=$_POST['lastname'];
	$dob=$_POST['dob'];
	$gender=$_POST['gender'];
	$password=$_POST['password'];
	$role=$_POST['role'];
	$query="insert into signupdetails   (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."','".$role."',null,now(),null);";
	if($role=="child"){
		$parent=$_POST['parent'];
		$query="insert into signupdetails   (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."','".$role."','".$parent."',now(),null);";
	}
	
	
	//print($query);
		if($connect->query($query)){
			"<br>".print("Sign Up successful. Wait for the approval from admin. If you think approved, click on login <a href=login.php >Login here</a>");
			
		}else{
			"<br>".print("Sign up failed");
		}
	}else{
		print("db not connected");
	}
}

?>