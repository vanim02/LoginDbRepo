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
				<th >
					Parent
				</th>
				<th>
					Children
				</th>
			</tr>
			<?php
			
				$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
				if($connect){
					$query="select * from signupdetails where role='parent'";
					$result=$connect->query($query);
						while($dbfield=$result->fetch_assoc()){
							print("<tr><td>".$dbfield['username']."</td>");
							$query2="select * from signupdetails where role='child' and parent='".$dbfield['username']."'";
							$result2=$connect->query($query2);
							//creating new table in the second column for children
							print("<td><table>");
							while($chfield=$result2->fetch_assoc()){
								print("<tr><td>".$chfield['username']."</td></tr>");
							}
						print("</table></td></tr>");
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