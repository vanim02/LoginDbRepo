<?php
echo 'hi';
	function connect(){
	$connect= mysqli_connect("85.10.205.173","vanilogindb","65096865","vanilogindb");
	return $connect;
	}
		$connect=connect();
		if($connect){
	echo 'connected';
	}else{
	echo 'not connected';
}

?>
