<!DOCTYPE html>
<html>
<head>
	<title>Practical 5</title>
</head>
<body>
	<h1>Practical 5</h1>
	<h4>Q. Write a PHP function that checks if a string is all lower case.</h4>
	<form action="" method="post">
		<input type="text" name="n">
		<input type="submit" name="btn" >
	</form>

	<?php
		function check($n)
		{ 
			$l = (strlen($n));
			$temp = 0;
			for($i=0;$i<$l;$i++)
			{
				global $temp;
				$value = ord($n[$i])."<br>";
				if($value>=65 && $value<=90)
					$temp++;
			}
			if($temp==0)
			{
				echo "All character are lowercase.";
			}
			else
			{
				echo "All character are not lowercase.";
			}
		}
		if(isset($_POST["btn"]))
		{
			$num = htmlentities($_POST["n"]);
			check($num);
		}
	?>
</body>
</html>