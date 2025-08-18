<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a5.php" method="get">
        <h1>coloque 3 valores</h1>
        <input type="number" name="v1" id="">
        <input type="number" name="v2" id="">
        <input type="number" name="v3" id="">

        <input type="submit" value="sub">
    </form>

    <?php

        $valor = $_GET["v1"];

        if ($valor > $_GET["v2"]) {
            $valor = $_GET["v2"];
        }
        
        if ($valor > $_GET["v3"]) {
            $valor = $_GET["v3"];
        }


        echo "O menor valor é ".$valor;
    ?>
</body>
</html>