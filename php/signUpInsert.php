<?php


if(isset($_POST['submitSignUp'])){
	$connect= mysqli_connect("127.0.0.1","root","1234","logindb");
if($connect){
	if(empty($_POST['gender'])){
		$_POST['gender']=null;
	}
	$query="insert into signupdetails   (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$_POST['username']."','".$_POST['firstname']."','".$_POST['lastname']."','".$_POST['dob']."','".$_POST['gender']."','".$_POST['password']."','".$_POST['role']."',null,now(),null);";
	if($_POST['role']=="child"){
		//$parent=$_POST['parent'];
		$query="insert into signupdetails (username,firstname,lastname,dateofbirth,gender,password,role,parent,signupdate,decision) values ('".$_POST['username']."','".$_POST['firstname']."','".$_POST['lastname']."','".$_POST['dob']."','".$_POST['gender']."','".$_POST['password']."','".$_POST['role']."','".$_POST['parent']."',now(),null);";
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