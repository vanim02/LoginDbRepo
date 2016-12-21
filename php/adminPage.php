<html>
<head>
<title> Admin Page</title>
</head>
<body>
<?php
	if(isset($_POST['submitdecision'])){
		$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
		if($connect){
			print("connected still");
			$decision=$_POST['decision'];
			$query="update signupdetails set decision='".$decision."' where username = '".$field['username']."'";
			mysqli_close($connect);
		}
	}
?>
	<table>
		<tr>
			<td>
				<h1> Admin Page </h1>
			</td>
			<td>
				<input type="button" id="logout" value="Logout" onClick="window.open('logout.php','_self')"></input>
			</td>
		</tr>
	</table>
<?php
$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
?>
<div id="approved" style="width: 30%; height: 100%;float: left;background-color:red;border: 1px solid black;" >
	<h3>Approved Users</h3>
	<?php
	if($connect->connect_error){
		print("connection error");
		
	}else{
		$result=$connect->query("select * from signupdetails where decision='A'");
		if($result->num_rows>0){
			while($field=$result->fetch_assoc()){
				print($field['firstname']." ".$field['lastname'])."<br>";
			}
		}
	}
	?>
	</div>
<div id="waiting" style="width: 39%; height: 100%;float: left;background-color:blue;border: 1px solid black;">
	<h3>Waiting Users</h3>
	<?php
	if($connect->connect_error){
		print("connection error");
		
	}else{
		$result=$connect->query("select * from signupdetails where decision IS NULL");
		if($result->num_rows>0){
			print("<table>");
			print("<tr><th>Firstname Lastname</th><th>Username</th><th>Role</th></tr>");
			while($field=$result->fetch_assoc()){
				print("<tr><td>".$field['firstname']." ".$field['lastname']."</td>");
				print("<td>".$field['username']."</td>");
				print("<td>".$field['role']."</td></tr>");
				print("<tr><td><input type=\"radio\" id=\"decision\" name=\"descion\" value=\"approve\"></input> Approve </td><td> <input type=\"radio\" id=\"deciosn\" name=\"decision\" value=\"Decline\"></input> Decline</td>")."<br>";	
				
				print("<td><input type=\"submit\" id=\"submitdecision\" name=\"submitdecision\" onClick=\"adminPage.php\"></td>");
			}
			print("</table>");
		}
	}
	?>

</div>
<div id="declined" style="width: 30%; height: 100%;float: right;background-color:yellow;border: 1px solid black;"> 
	<h3>Declined Users <h3>
	<?php
	if($connect->connect_error){
		print("connection error");
	}else{
		$result=$connect->query("select * from signupdetails where decision='D'");
		if($result->num_rows>0){
			while($field=$result->fetch_assoc()){
				print($field['firstname']." ". $field['lastname'])."<br>";
			}
		}
	}
	?>
	</div>
	
	<?php
		mysqli_close($connect);
	?>
</body>

</html>