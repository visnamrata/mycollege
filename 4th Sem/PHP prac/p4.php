<!DOCTYPE html>
<html>
<head>
	<title>Practical 4</title>
</head>
<body>
	<h1>Practical 4</h1>
	<h4>Q. Create a PHP page which accepts string from user. After submission that page displays the reverse of provided string.</h4>
	<form action="" method="post">
		<input type="text" name="n">
		<input type="submit" name="btn" >
	</form>

	<?php
		function show($n)
		{ 
			$l = (strlen($n)-1);
			for($i=$l;$i>=0;$i--)
			{
				echo $n[$i];
			}
		}
		if(isset($_POST["btn"]))
		{
			$num = htmlentities($_POST["n"]);
			show($num);
		}
	?>
</body>
</html>