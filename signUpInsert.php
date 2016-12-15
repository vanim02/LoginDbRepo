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
	//$userrole=$_POST['userrole'];
	//$parent=$_POST['parent'];
	$query="insert into signupdetails values ('".$username."','".$firstname."','".$lastname."','".$dob."','".$gender."','".$password."',null);";
	print($query);
	if($connect->query($query)){
		"<br>".print("inserted successfully");
	}else{
		"<br>".print("insertion failed");
	}
	}else{
		print("db not connected");
	}
}

?>