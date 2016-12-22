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
		
			$query="update signupdetails set decision='".$_POST['decision']."' where username = '".$_POST['username']."'";
			print($query);
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
				print("<td><input  type=\"hidden\" name=\"username\" value=\"".$field['username']."\">".$field['username']."</input></td>");
				print("<td>".$field['role']."</td></tr>");
				print("</table>");
				print("<form name=\"decisionform\" method=\"POST\" action=\"adminPage.php\">");
				print("<input type=\"radio\" id=\"decision\" name=\"decision\" value=\"approve\"></input> Approve </td><td> <input type=\"radio\" id=\"decision\" name=\"decision\" value=\"Decline\"></input> Decline")."<br>";	
				
				print("<input type=\"submit\" id=\"submitdecision\" name=\"submitdecision\" ></input>");
				print("</form>");
			}
			
			
		}
	}
	?>

</div>
<div id="declined" style="width: 30%; height: 100%;float: right;background-color:yellow;border: 1px solid black;"> 
	<h3>Declined Users </h3>
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
	
</body>

</html>