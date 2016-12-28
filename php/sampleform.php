<html>
<head>
</head>
<body>
<?php 
if(isset($_POST['submit'])){
	echo 'submtted';
	$firstname=$_POST['firstname'];
	if(!empty($firstname)){
		echo 'connecting';
		$connect=mysqli_connect("85.10.205.173","vanilogindb","65096865","vanilogindb");
		if($connect){	
		echo 'connected';
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
