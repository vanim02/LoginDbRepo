<?php
if(isset($_POST['submitlogin'])){
	/*
$enteredusername=$_POST['username'];
print($enteredusername);
print("<br>");
$enteredpassword=$_POST['password'];
print($enteredpassword);
print("<br>");	
$gender=$_POST['gender'];
print($gender);
print("<br>");	
$role=$_POST['role'];
print($role);

*/
$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
if($connect){
	 
	 $inputuser=$_POST['username'];
	 $inputpassword=$_POST['password'];
	 $inputrole=$_POST['role'];
	 //$query="select username from candidate";
	$query="select count(*) as count from candidate where username='".$inputuser."' and password='".$inputpassword."' and role='".strtolower($inputrole)."'";
	print($query)."<br>";
	$result=mysqli_query($connect,$query); 
	//while($field=mysqli_fetch_assoc($result)){
		//print($field['username']);
	//}
	if($result){
		$dbfield=mysqli_fetch_assoc($result);
		if($dbfield['count']==1	){
			print("valid user");
		}
		else{
		print("invalid user");
		}
		
	}else{
		print("invalid user");
	}
	
}
}
?>