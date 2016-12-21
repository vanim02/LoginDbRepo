
<html>
<head>
<title>Parent Page</title>
</head>
<body>
	<table border= 1px >
	<tr>
		<th colspan="6"> Parent Page </th>
	</tr>
	<tr>
		<th colspan="6">
			<?php
				session_start();
				print($_SESSION["inputuser"]);
			?>
		</th>
	</tr>
	<tr>
		<th>Username</th>
		<th>Firstname</th>
		<th>Lastname</th>
		<th>Gender</th>
		<th>Signup Date</th>
		<th>Decision</th>
	
	</tr>
	<?php
		$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
		if($connect){
			$query="select * from signupdetails where role='child' and parent='".$_SESSION["inputuser"]."'";
			//print($query);
			$result=$connect->query($query);
			if($result){
				while($dbfield=$result->fetch_assoc()){
					print("<tr><td>".$dbfield['username']."</td><td>".$dbfield['firstname']."</td><td>".$dbfield['lastname']."</td><td>".$dbfield['gender']."</td><td>".$dbfield['signupdate']."</td><td>".$dbfield['decision']."</td></tr>");
				 }
			}
			mysqli_close($connect);
		}
	?>
	</table>

	<input type="button" id="addchild" value="Add Child" onClick="window.open('addChild.php','_self')"></input>
	<input type="button" id="deletechild" value="Delete Child" onClick="window.open('deleteChild.php','_self')"></input><br>
	<input type="button" id="logout" value="Logout" onClick="window.open('logout.php','_self')"></input>
	
</body>

</html>