<?php 
$username="root";
$password="1234";
$database="sales";
$server="127.0.0.1";

$link=mysqli_connect($server,$username,$password);

$db_found=mysqli_select_db($link,$database);
if($db_found){
	print("open");
	$query="select * from customer";
	$result=mysqli_query($link,$query);
	while($dbfield=mysqli_fetch_assoc($result)){
		print($dbfield['customerid'])."<br>";
	}
	
}else{
	print("not found");
}
mysqli_close($link);
?>