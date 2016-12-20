<?php
if(isset($_POST['submitlogin'])){
	$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
	if($connect){
		session_start();
		$_SESSION["inputuser"]=$_POST['username'];
		// $inputuser=$_POST['username'];
		 $_SESSION["inputpassword"]=$_POST['password'];
		 $_SESSION["inputrole"]=$_POST['role'];
		 
		//$query="select * from signupdetails where username='".$inputuser."' and password='".$inputpassword."' and role='".strtolower($_SESSION["inputrole"])."'";
		$query="select * from signupdetails where username='".$_SESSION["inputuser"]."' and password='". $_SESSION["inputpassword"]."' and role='".strtolower($_SESSION["inputrole"])."'";
		print($query)."<br>";
		$result=mysqli_query($connect,$query); 
		
		if($result){
			
			$dbfield=mysqli_fetch_assoc($result);
			
				if($dbfield['decision']=='A'){
					if(strtolower($_SESSION["inputrole"])=='teacher'){
						header("Location: teacherPage.php");
						exit;
					}else if(strtolower($_SESSION["inputrole"])=='parent'){
						header("Location: parentPage.php");
						exit;
					}
					
				}else if($dbfield['decision']=='D'){
					
					print("Your sign up has been declined by the admin.");
				}else if(!$dbfield['decision']){
				
					print("Your sign up is waiting for the approval from admin");
					
				}else{
					print("invalid user");
				}
			
		}else{
			print("invalid user");
		}
		
	}
}
?>