
<html>
<head>
<title> Admin Page</title>
</head>
<body>
<?php
	if(isset($_POST['submitdelete'])){
		$connect=new mysqli("127.0.0.1","root","1234","logindb");
		if($connect){
			$query="delete from signupdetails where username='".$_POST['deleteuser']."'";
			$result=$connect->query($query);
			if($result){
				print("Deleted child successfully");
				header('Location:parentPage.php');
			}else{
				print("Could not delte child");
			}
			mysqli_close($connect);
		}else if($connect->connect_error){
			print("connection failure");
		}
		
	}
	
?>
<h3> Enter the user name of child to delete </h3>
	<form name="deleteform" method="POST" action="deleteChild.php">
		Username: * <input type="text" id="deleteuser" name="deleteuser" required="true"></input><br>
		<input type="submit" name="submitdelete" id="delete" value="Delete"></input>
		<input type="button" id="cancel" name="cancel" value="cancel" onClick="window.open('parentPage.php','_self')"></input>
	</form>
</body>
</html>