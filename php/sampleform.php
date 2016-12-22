<html>
<head>
</head>
<body>
<?php 
if(isset($_POST['submit'])){
	$firstname=$_POST['firstname'];
	if(!empty($firstname)){
		$connect=mysqli_connect("127.0.0.1","root","1234","logindb");
		if($connect){	
			$result=$connect->query("insert into simple values ('".$firstname."')");
			print($firstname);
		}
	}else{
		print("blank");
	}
}
?>
<form name="simpleform" method="POST" action="sampleform.php">

<input type="text" id="firstname" name="firstname" required="true"></input>
<input type="submit" name="submit" ></input>
</form>
</body>
</html>
