<!DOCTYPE html>
<html>
<head>
	<title>Practical 3</title>
</head>
<body>
	<h2>Practical 3</h2>
	<p>(a) Remove whitespace from string</p>
	<form method="post" action="">
		Enter String: <input type="text" name="strA"><br>
		<input type="submit" name="btna">
	</form>
	<?php
		if (isset($_POST['btna'])) 
		{
			$str = $_POST['strA'];
			echo "OUTPUT: ".str_replace(' ', '', $str);
			
		}
	?>

	<p>(b) Checks if a string contains another string</p>
	<form method="post" action="">
		Enter String: <input type="text" name="strB"><br>
		String to be searched: <input type="text" name="searchB"><br>
		<input type="submit" name="btnb">
	</form>
	<?php
		if (isset($_POST['btnb'])) 
		{
			$s1 = $_POST['strB'];
			$s2 = $_POST['searchB'];
			echo "OUTPUT: ";
			if (strpos($s1, $s2) !== false) 
			    echo("Found"); 
			else
			    echo("Not found"); 

			
		}
	?>

	<p>(c)  Checks if a string is all lowercase</p>
	<form method="post" action="">
		Enter String: <input type="text" name="strC"><br>
		<input type="submit" name="btnc">
	</form>
	<?php
		if (isset($_POST['btnc'])) 
		{
			$str = $_POST['strC'];
			if (preg_match("/[A-Z]/", $str)) 
		     	   print "all character are not Small!";
		  	else
		   	   print "all Small character!";
			
		}
	?>

	<p>(d) Replace the first 'the' from string with 'that'</p>
	<form method="post" action="">
		Enter String: <input type="text" name="strD"><br>
		<input type="submit" name="btnd">
	</form>
	<?php
		if (isset($_POST['btnd'])) 
		{
			echo "OUTPUT: ";
			$str = $_POST['strD'];
			// echo strpos($str, 'the');
			$num = 1;
			echo preg_replace('/the/', 'that', $str, $num );
		}
	?>

</body>
</html>
