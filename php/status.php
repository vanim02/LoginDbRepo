<?php
session_start();

$connect = mysqli_connect("127.0.0.1","root","1234","logindb");
if($connect){
	$query="select decision from signupdetails where username=$_SESSION[\"inputuser\"] and password=$_SESSION[\"inputpassword\"] and role=$_SESSION[\"inputrole\"]";
	$print($query);
	$result=mysqli_query($connect,$query);
	if($result){
		$dbfield=mysqli_fetch_assoc($result);
		if(dbfield['decision']=='D'){
			print("You sign up has been declined by the admin.");
		}else{
			print("Your sign up is waiting for the approval from admin");
		}
	}
}


?>