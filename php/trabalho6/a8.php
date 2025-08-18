<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a8.php">
        <input type="number" name="c1" id="">
        <input type="number" name="c2" id="">
        <input type="submit" value="sub">
    </form>

    <?php

        $c1 = $_GET["c1"];
        $c2 = $_GET["c2"];

        $hip = $c1**2 + $c2**2;

        $hip = $hip**(1/2);

        echo "C1: $c1<br>C2: $c2<br>Hipotenusa: $hip<br>Area: ".($c1*$c2/2)."<br>Perimetro: ".($c1+$c2+$hip);

    ?>
</body>
</html>