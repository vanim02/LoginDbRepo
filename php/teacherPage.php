<html>
	<head>
	<title> Teacher Page</title>
	</head>
	<body>
		<table border= 1px >
			<tr>
				<th colspan="2"> Teacher Page </th>
			</tr>
			<tr>
				<th colspan="2">
					
				</th>
			</tr>
			<?php
			
				$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
				if($connect){
					$query="select * from signupdetails where role='parent'";
					$result=$connect->query($query);
					while($dbfield=$result->fetch_assoc()){
						print("<tr><td>".$dbfield['username']."</td></tr>");
					}
							mysqli_close($connect);
				}else{
					print("Database connection failure");
				}
			?>
		</table>
		<input type="button" id="logout" value="Logout" onClick="window.open('logout.php','_self')"></input>
	</body>
</html>