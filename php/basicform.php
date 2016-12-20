<html>
<head>
<title>A BASIC HTML FORM</title>
<?PHP

$username = $_POST['username'];
print ($username);

?> 
</head>
<body>

<FORM NAME ="form1" METHOD ="POST" ACTION = "basicform.php">

<INPUT TYPE = "TEXT" VALUE ="username" name="username">
<INPUT TYPE = "Submit" Name = "Submit1" VALUE = "Login">

</FORM>

</body>
</html>	