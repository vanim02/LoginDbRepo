<html>
<head>
<title> Admin Page</title>
</head>
<body>
<h1> Admin Page </h1>
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
				print($field['firstname']."___         ".$field['lastname'])."<br>";
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
			while($field=$result->fetch_assoc()){
				print($field['firstname']."____ ".$field['lastname']);
			}
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
				print($field['firstname']."___". $field['lastname']);
			}
		}
	}
	?>
	</div>
</body>

</html>