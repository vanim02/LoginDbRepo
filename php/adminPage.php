<html>
<head>
<title> Admin Page</title>
</head>
<body>
<?php
include 'dbconnect.php';


	if(isset($_POST['submitdecision'])){
		//$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
		$connect1=connect();
			if($connect1){
			$decision=$_POST['decision'];
			$user=$_POST['username'];
			$query="update signupdetails set decision='".$decision."' where username = '".$user."'";
			
			if($result=$connect1->query($query)){
				print("Decision processed");
			}
			mysqli_close($connect1);
		}else{
			print("connection failure");
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
$connect=connect();
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
				print($field['firstname']." ".$field['lastname']." ".$field['username'])."<br>";
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
			?>
			<table>
			<tr><th>Firstname Lastname</th><th>Username</th><th>Role</th></tr>
		<?php	while($field=$result->fetch_assoc()){
				print("<tr><td>".$field['firstname']." ".$field['lastname']." ".$field['username']."</td>");
				print("<td>".$field['role']."</td></tr>");
				print("</table>");
				print("<form name=\"decisionform\" method=\"POST\" action=\"adminPage.php\">");
				print("<input type=\"radio\" id=\"decision\" name=\"decision\" value=\"A\"></input> Approve"); 
				print("<input type=\"radio\" id=\"decision\" name=\"decision\" value=\"D\"></input> Decline");
				print("<input type=\"hidden\" name=\"username\" value=\"".$field['username']."\">");
				print("<br>");
				print("<INPUT TYPE=\"submit\" NAME=\"submitdecision\" VALUE=\"submit_".$field['username']."\"></INPUT>");
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
				print($field['firstname']." ". $field['lastname']." ".$field['username'])."<br>";
			}
		}
	}
	?>
	</div>
	
</body>

</html>
