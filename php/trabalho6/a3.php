<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="./a3.php" method="get">
        <h1>coloque 10 numeros</h1>
        <input type="number" name="v1" id=""><br>
        <input type="number" name="v2" id=""><br>
        <input type="number" name="v3" id=""><br>
        <input type="number" name="v4" id=""><br>
        <input type="number" name="v5" id=""><br>
        <input type="number" name="v6" id=""><br>
        <input type="number" name="v7" id=""><br>
        <input type="number" name="v8" id=""><br>
        <input type="number" name="v9" id=""><br>
        <input type="number" name="v10" id=""><br>

        <input type="submit" value="sub">

        <?php

            $media = 0;

            for ($i=1; $i <= 10; $i++) { 
                $media += $_GET["v".$i];    
            }

            echo "media: ".$media/10;
        ?>
    </form>
</body>
</html>